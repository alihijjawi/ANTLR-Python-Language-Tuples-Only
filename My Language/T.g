grammar T;

options { 	language = Java;
		backtrack = true;}

@members{ 	PythonThing PT = new PythonThing();}    // I acknowledge the fact that a lot of the "assignment" statements in the grammar
                                                        // can be optimized, and easily made better
                                                        // However due to time constraint and a lot of technical issue that disallowed me
                                                        // to proceed with this HW as planned, this would have to do in general. 
                                                        // I tried including all cases i could, but i did no want to change anything at the
                                                        // last moments before deadline since the time it took was too much for a rather
                                                        // easy idea.
                                                        // Thank you for understanding
                                                        // Ali Hijjawi - 202000754

prog:                   (stat)+  
		        ;

stat:                   assignment | (print)+ | tuple_unpack
                        ;

assignment:             x = ID '=' int1 = INT                           {PT.assign($x.text, Integer.parseInt($int1.text));}
                        ('+' int2 = INT                                 {PT.addINT($x.text, Integer.parseInt($int2.text));}
                        )*
                        | 
                        y = ID '=' s1 = string                          {PT.assign($y.text, $s1.text.substring(1, $s1.text.length()-1));}
                        ('+' s2 = string                                {PT.strConcat($y.text, $s2.text.substring(1, $s2.text.length()-1));
                                                                        PT.strConcat($y.text, "\"");}
                        )*
                        |
                        i0 = ID '[' i1 = INT ']' '='
                        (e2 = expression                                {PT.tupleUpdate($i0.text, Integer.parseInt($i1.text), $e2.exp_val);}
                        | 
                        t = tuple [$e2.text] /* as temp value */        {PT.tuplePush($i0.text, Integer.parseInt($i1.text), $e2.text);}
                        )
                        |
                        i1 = ID f = '='                                 {PT.assignTuple($i1.text);}
                        ( i2 = ID                                       {PT.tupleConcat($i1.text, $i2.text);}
                        ('+' i3 = ID                                    {PT.tupleConcat($i1.text, $i3.text);}
                        )*                        
                        |
                        i4 = ID '[' (start=INT)? ':' (stop=INT)? ']'    {PT.tupleSliceAssign($i1.text, $i4.text, $start.text, $stop.text);}
                        | tuple [$i1.text]
                        ( '+' tuple [$f.text] /* as temp value */       {PT.tupleConcat($i1.text, $f.text);}
                        )*
                        )
                        |
                        i1 = ID '=' e1 = expression                     {PT.assign($i1.text, $e1.exp_val);}
                        ( '+' e2 = expression                           {PT.add($i1.text, $e2.exp_val);}
                        )*
                        ;

expression
returns
[Object exp_val]:       INT 					        {$exp_val = Integer.parseInt($INT.text);}
 		        | string 				        {$exp_val = $string.text.substring(1,$string.text.length()-1);}
		        | f = ID			                {$exp_val = PT.getValue($f.text);}
                        | i = ID '[' n = expression ']'                 {$exp_val = PT.indexing($i.text, $n.exp_val);}
                        | h=ID '[' a = expression ':' b = expression ']'{$exp_val = PT.tupleSlice($h.text, $a.exp_val, $b.exp_val);}
                        |
	                ;

tuple 
[String id_tuple]:      '(' tuple_tail [id_tuple] ')'
                        ;

tuple_tail [String id_tuple_tail]:
                        (e1 = expression                        {PT.tupleCreate(id_tuple_tail, $e1.exp_val);}
                        ( ',' e2 = expression                   {PT.tupleCreate(id_tuple_tail, $e2.exp_val);}
                        )*)
                        |
                        ;

string:  	('"' (~('"'))* '"')	                       
                ;

tuple_unpack:   '(' e1 = expression                             {PT.unpackSet($e1.exp_val);}
                ( ',' e2 = expression                           {PT.unpackSet($e2.exp_val);}
                )*
                ')' '='
		i1 = ID 				        {PT.unpackCreate($i1.text);}
                ;

print:          'print' '(' e1 = expression                     {System.out.println($e1.exp_val);}
                (',' e2 = expression                            {System.out.println($e2.exp_val);}
                )*
                ')'
                ;



ID:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    	;

INT:	(('-')? ('0'..'9')+)
    	;

WS 	:   (' '|'\t'|'\n'|'\r')+ {skip();}
        ;

COMMENTS: ('#') (~('\n' | '\r'))* {skip();}
        ;