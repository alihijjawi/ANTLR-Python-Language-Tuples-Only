// $ANTLR 3.5.2 T.g 2021-04-10 22:48:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class TParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENTS", "ID", "INT", "WS", 
		"'\"'", "'('", "')'", "'+'", "','", "':'", "'='", "'['", "']'", "'print('"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int COMMENTS=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public TParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return TParser.tokenNames; }
	@Override public String getGrammarFileName() { return "T.g"; }

	 	PythonThing PT = new PythonThing();


	// $ANTLR start "prog"
	// T.g:16:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try {
			// T.g:16:5: ( ( stat )+ )
			// T.g:16:25: ( stat )+
			{
			// T.g:16:25: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==9||LA1_0==17) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// T.g:16:26: stat
					{
					pushFollow(FOLLOW_stat_in_prog514);
					stat();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// T.g:19:1: stat : ( assignment | ( print )+ | tuple_unpack );
	public final void stat() throws RecognitionException {
		try {
			// T.g:19:5: ( assignment | ( print )+ | tuple_unpack )
			int alt3=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt3=1;
				}
				break;
			case 17:
				{
				alt3=2;
				}
				break;
			case 9:
				{
				alt3=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// T.g:19:25: assignment
					{
					pushFollow(FOLLOW_assignment_in_stat554);
					assignment();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// T.g:19:38: ( print )+
					{
					// T.g:19:38: ( print )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==17) ) {
							int LA2_2 = input.LA(2);
							if ( (synpred3_T()) ) {
								alt2=1;
							}

						}

						switch (alt2) {
						case 1 :
							// T.g:19:39: print
							{
							pushFollow(FOLLOW_print_in_stat559);
							print();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					}
					break;
				case 3 :
					// T.g:19:49: tuple_unpack
					{
					pushFollow(FOLLOW_tuple_unpack_in_stat565);
					tuple_unpack();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stat"



	// $ANTLR start "assignment"
	// T.g:22:1: assignment : (x= ID '=' int1= INT ( '+' int2= INT )* |y= ID '=' s1= string ( '+' s2= string )* |i0= ID '[' i1= INT ']' '=' (e2= expression |t= tuple[$e2.text] ) |i1= ID f= '=' (i2= ID ( '+' i3= ID )* |i4= ID '[' (start= INT )? ':' (stop= INT )? ']' | tuple[$i1.text] ( '+' tuple[$f.text] )* ) |i1= ID '=' e1= expression ( '+' e2= expression )* );
	public final void assignment() throws RecognitionException {
		Token x=null;
		Token int1=null;
		Token int2=null;
		Token y=null;
		Token i0=null;
		Token i1=null;
		Token f=null;
		Token i2=null;
		Token i3=null;
		Token i4=null;
		Token start=null;
		Token stop=null;
		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope e1 =null;

		try {
			// T.g:22:11: (x= ID '=' int1= INT ( '+' int2= INT )* |y= ID '=' s1= string ( '+' s2= string )* |i0= ID '[' i1= INT ']' '=' (e2= expression |t= tuple[$e2.text] ) |i1= ID f= '=' (i2= ID ( '+' i3= ID )* |i4= ID '[' (start= INT )? ':' (stop= INT )? ']' | tuple[$i1.text] ( '+' tuple[$f.text] )* ) |i1= ID '=' e1= expression ( '+' e2= expression )* )
			int alt13=5;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				int LA13_1 = input.LA(2);
				if ( (synpred6_T()) ) {
					alt13=1;
				}
				else if ( (synpred8_T()) ) {
					alt13=2;
				}
				else if ( (synpred10_T()) ) {
					alt13=3;
				}
				else if ( (synpred17_T()) ) {
					alt13=4;
				}
				else if ( (true) ) {
					alt13=5;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// T.g:22:25: x= ID '=' int1= INT ( '+' int2= INT )*
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_assignment613); if (state.failed) return;
					match(input,14,FOLLOW_14_in_assignment615); if (state.failed) return;
					int1=(Token)match(input,INT,FOLLOW_INT_in_assignment621); if (state.failed) return;
					if ( state.backtracking==0 ) {PT.assign((x!=null?x.getText():null), Integer.parseInt((int1!=null?int1.getText():null)));}
					// T.g:23:25: ( '+' int2= INT )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==11) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// T.g:23:26: '+' int2= INT
							{
							match(input,11,FOLLOW_11_in_assignment676); if (state.failed) return;
							int2=(Token)match(input,INT,FOLLOW_INT_in_assignment682); if (state.failed) return;
							if ( state.backtracking==0 ) {PT.addINT((x!=null?x.getText():null), Integer.parseInt((int2!=null?int2.getText():null)));}
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;
				case 2 :
					// T.g:26:25: y= ID '=' s1= string ( '+' s2= string )*
					{
					y=(Token)match(input,ID,FOLLOW_ID_in_assignment800); if (state.failed) return;
					match(input,14,FOLLOW_14_in_assignment802); if (state.failed) return;
					pushFollow(FOLLOW_string_in_assignment808);
					s1=string();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {PT.assign((y!=null?y.getText():null), (s1!=null?input.toString(s1.start,s1.stop):null).substring(1, (s1!=null?input.toString(s1.start,s1.stop):null).length()-1));}
					// T.g:27:25: ( '+' s2= string )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==11) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// T.g:27:26: '+' s2= string
							{
							match(input,11,FOLLOW_11_in_assignment862); if (state.failed) return;
							pushFollow(FOLLOW_string_in_assignment868);
							s2=string();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {PT.strConcat((y!=null?y.getText():null), (s2!=null?input.toString(s2.start,s2.stop):null).substring(1, (s2!=null?input.toString(s2.start,s2.stop):null).length()-1));
							                                                                        PT.strConcat((y!=null?y.getText():null), "\"");}
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;
				case 3 :
					// T.g:31:25: i0= ID '[' i1= INT ']' '=' (e2= expression |t= tuple[$e2.text] )
					{
					i0=(Token)match(input,ID,FOLLOW_ID_in_assignment984); if (state.failed) return;
					match(input,15,FOLLOW_15_in_assignment986); if (state.failed) return;
					i1=(Token)match(input,INT,FOLLOW_INT_in_assignment992); if (state.failed) return;
					match(input,16,FOLLOW_16_in_assignment994); if (state.failed) return;
					match(input,14,FOLLOW_14_in_assignment996); if (state.failed) return;
					// T.g:32:25: (e2= expression |t= tuple[$e2.text] )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==EOF||(LA6_0 >= ID && LA6_0 <= INT)||LA6_0==8||LA6_0==17) ) {
						alt6=1;
					}
					else if ( (LA6_0==9) ) {
						int LA6_6 = input.LA(2);
						if ( (synpred9_T()) ) {
							alt6=1;
						}
						else if ( (true) ) {
							alt6=2;
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// T.g:32:26: e2= expression
							{
							pushFollow(FOLLOW_expression_in_assignment1027);
							e2=expression();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {PT.tupleUpdate((i0!=null?i0.getText():null), Integer.parseInt((i1!=null?i1.getText():null)), (e2!=null?((TParser.expression_return)e2).exp_val:null));}
							}
							break;
						case 2 :
							// T.g:34:25: t= tuple[$e2.text]
							{
							pushFollow(FOLLOW_tuple_in_assignment1117);
							tuple((e2!=null?input.toString(e2.start,e2.stop):null));
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {PT.tuplePush((i0!=null?i0.getText():null), Integer.parseInt((i1!=null?i1.getText():null)), (e2!=null?input.toString(e2.start,e2.stop):null));}
							}
							break;

					}

					}
					break;
				case 4 :
					// T.g:37:25: i1= ID f= '=' (i2= ID ( '+' i3= ID )* |i4= ID '[' (start= INT )? ':' (stop= INT )? ']' | tuple[$i1.text] ( '+' tuple[$f.text] )* )
					{
					i1=(Token)match(input,ID,FOLLOW_ID_in_assignment1212); if (state.failed) return;
					f=(Token)match(input,14,FOLLOW_14_in_assignment1218); if (state.failed) return;
					if ( state.backtracking==0 ) {PT.assignTuple((i1!=null?i1.getText():null));}
					// T.g:38:25: (i2= ID ( '+' i3= ID )* |i4= ID '[' (start= INT )? ':' (stop= INT )? ']' | tuple[$i1.text] ( '+' tuple[$f.text] )* )
					int alt11=3;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ID) ) {
						int LA11_1 = input.LA(2);
						if ( (LA11_1==15) ) {
							alt11=2;
						}
						else if ( (LA11_1==EOF||LA11_1==ID||LA11_1==9||LA11_1==11||LA11_1==17) ) {
							alt11=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 11, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA11_0==9) ) {
						alt11=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}

					switch (alt11) {
						case 1 :
							// T.g:38:27: i2= ID ( '+' i3= ID )*
							{
							i2=(Token)match(input,ID,FOLLOW_ID_in_assignment1284); if (state.failed) return;
							if ( state.backtracking==0 ) {PT.tupleConcat((i1!=null?i1.getText():null), (i2!=null?i2.getText():null));}
							// T.g:39:25: ( '+' i3= ID )*
							loop7:
							while (true) {
								int alt7=2;
								int LA7_0 = input.LA(1);
								if ( (LA7_0==11) ) {
									alt7=1;
								}

								switch (alt7) {
								case 1 :
									// T.g:39:26: '+' i3= ID
									{
									match(input,11,FOLLOW_11_in_assignment1351); if (state.failed) return;
									i3=(Token)match(input,ID,FOLLOW_ID_in_assignment1357); if (state.failed) return;
									if ( state.backtracking==0 ) {PT.tupleConcat((i1!=null?i1.getText():null), (i3!=null?i3.getText():null));}
									}
									break;

								default :
									break loop7;
								}
							}

							}
							break;
						case 2 :
							// T.g:42:25: i4= ID '[' (start= INT )? ':' (stop= INT )? ']'
							{
							i4=(Token)match(input,ID,FOLLOW_ID_in_assignment1501); if (state.failed) return;
							match(input,15,FOLLOW_15_in_assignment1503); if (state.failed) return;
							// T.g:42:37: (start= INT )?
							int alt8=2;
							int LA8_0 = input.LA(1);
							if ( (LA8_0==INT) ) {
								alt8=1;
							}
							switch (alt8) {
								case 1 :
									// T.g:42:38: start= INT
									{
									start=(Token)match(input,INT,FOLLOW_INT_in_assignment1508); if (state.failed) return;
									}
									break;

							}

							match(input,13,FOLLOW_13_in_assignment1512); if (state.failed) return;
							// T.g:42:54: (stop= INT )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==INT) ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// T.g:42:55: stop= INT
									{
									stop=(Token)match(input,INT,FOLLOW_INT_in_assignment1517); if (state.failed) return;
									}
									break;

							}

							match(input,16,FOLLOW_16_in_assignment1521); if (state.failed) return;
							if ( state.backtracking==0 ) {PT.tupleSliceAssign((i1!=null?i1.getText():null), (i4!=null?i4.getText():null), (start!=null?start.getText():null), (stop!=null?stop.getText():null));}
							}
							break;
						case 3 :
							// T.g:43:27: tuple[$i1.text] ( '+' tuple[$f.text] )*
							{
							pushFollow(FOLLOW_tuple_in_assignment1554);
							tuple((i1!=null?i1.getText():null));
							state._fsp--;
							if (state.failed) return;
							// T.g:44:25: ( '+' tuple[$f.text] )*
							loop10:
							while (true) {
								int alt10=2;
								int LA10_0 = input.LA(1);
								if ( (LA10_0==11) ) {
									alt10=1;
								}

								switch (alt10) {
								case 1 :
									// T.g:44:27: '+' tuple[$f.text]
									{
									match(input,11,FOLLOW_11_in_assignment1584); if (state.failed) return;
									pushFollow(FOLLOW_tuple_in_assignment1586);
									tuple((f!=null?f.getText():null));
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) {PT.tupleConcat((i1!=null?i1.getText():null), (f!=null?f.getText():null));}
									}
									break;

								default :
									break loop10;
								}
							}

							}
							break;

					}

					}
					break;
				case 5 :
					// T.g:48:25: i1= ID '=' e1= expression ( '+' e2= expression )*
					{
					i1=(Token)match(input,ID,FOLLOW_ID_in_assignment1707); if (state.failed) return;
					match(input,14,FOLLOW_14_in_assignment1709); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_assignment1715);
					e1=expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {PT.assign((i1!=null?i1.getText():null), (e1!=null?((TParser.expression_return)e1).exp_val:null));}
					// T.g:49:25: ( '+' e2= expression )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==11) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// T.g:49:27: '+' e2= expression
							{
							match(input,11,FOLLOW_11_in_assignment1765); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_assignment1771);
							e2=expression();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {PT.add((i1!=null?i1.getText():null), (e2!=null?((TParser.expression_return)e2).exp_val:null));}
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"


	public static class expression_return extends ParserRuleReturnScope {
		public Object exp_val;
	};


	// $ANTLR start "expression"
	// T.g:53:1: expression returns [Object exp_val] : ( INT | string |f= ID |i= ID '[' n= expression ']' |h= ID '[' a= expression ':' b= expression ']' |);
	public final TParser.expression_return expression() throws RecognitionException {
		TParser.expression_return retval = new TParser.expression_return();
		retval.start = input.LT(1);

		Token f=null;
		Token i=null;
		Token h=null;
		Token INT1=null;
		ParserRuleReturnScope n =null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope string2 =null;

		try {
			// T.g:55:17: ( INT | string |f= ID |i= ID '[' n= expression ']' |h= ID '[' a= expression ':' b= expression ']' |)
			int alt14=6;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt14=1;
				}
				break;
			case 8:
				{
				alt14=2;
				}
				break;
			case ID:
				{
				int LA14_3 = input.LA(2);
				if ( (synpred21_T()) ) {
					alt14=3;
				}
				else if ( (synpred22_T()) ) {
					alt14=4;
				}
				else if ( (synpred23_T()) ) {
					alt14=5;
				}
				else if ( (true) ) {
					alt14=6;
				}

				}
				break;
			case EOF:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 16:
			case 17:
				{
				alt14=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// T.g:55:25: INT
					{
					INT1=(Token)match(input,INT,FOLLOW_INT_in_expression1868); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.exp_val = Integer.parseInt((INT1!=null?INT1.getText():null));}
					}
					break;
				case 2 :
					// T.g:56:14: string
					{
					pushFollow(FOLLOW_string_in_expression1898);
					string2=string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.exp_val = (string2!=null?input.toString(string2.start,string2.stop):null).substring(1,(string2!=null?input.toString(string2.start,string2.stop):null).length()-1);}
					}
					break;
				case 3 :
					// T.g:57:13: f= ID
					{
					f=(Token)match(input,ID,FOLLOW_ID_in_expression1930); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.exp_val = PT.getValue((f!=null?f.getText():null));}
					}
					break;
				case 4 :
					// T.g:58:27: i= ID '[' n= expression ']'
					{
					i=(Token)match(input,ID,FOLLOW_ID_in_expression1982); if (state.failed) return retval;
					match(input,15,FOLLOW_15_in_expression1984); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression1990);
					n=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input,16,FOLLOW_16_in_expression1992); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.exp_val = PT.indexing((i!=null?i.getText():null), (n!=null?((TParser.expression_return)n).exp_val:null));}
					}
					break;
				case 5 :
					// T.g:59:27: h= ID '[' a= expression ':' b= expression ']'
					{
					h=(Token)match(input,ID,FOLLOW_ID_in_expression2040); if (state.failed) return retval;
					match(input,15,FOLLOW_15_in_expression2042); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2048);
					a=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input,13,FOLLOW_13_in_expression2050); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2056);
					b=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input,16,FOLLOW_16_in_expression2058); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.exp_val = PT.tupleSlice((h!=null?h.getText():null), (a!=null?((TParser.expression_return)a).exp_val:null), (b!=null?((TParser.expression_return)b).exp_val:null));}
					}
					break;
				case 6 :
					// T.g:61:18: 
					{
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"



	// $ANTLR start "tuple"
	// T.g:63:1: tuple[String id_tuple] : '(' tuple_tail[id_tuple] ')' ;
	public final void tuple(String id_tuple) throws RecognitionException {
		try {
			// T.g:64:18: ( '(' tuple_tail[id_tuple] ')' )
			// T.g:64:25: '(' tuple_tail[id_tuple] ')'
			{
			match(input,9,FOLLOW_9_in_tuple2118); if (state.failed) return;
			pushFollow(FOLLOW_tuple_tail_in_tuple2120);
			tuple_tail(id_tuple);
			state._fsp--;
			if (state.failed) return;
			match(input,10,FOLLOW_10_in_tuple2124); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tuple"



	// $ANTLR start "tuple_tail"
	// T.g:67:1: tuple_tail[String id_tuple_tail] : ( (e1= expression ( ',' e2= expression )* ) |);
	public final void tuple_tail(String id_tuple_tail) throws RecognitionException {
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		try {
			// T.g:67:34: ( (e1= expression ( ',' e2= expression )* ) |)
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= ID && LA16_0 <= INT)||LA16_0==8||LA16_0==12) ) {
				alt16=1;
			}
			else if ( (LA16_0==10) ) {
				int LA16_2 = input.LA(2);
				if ( (synpred25_T()) ) {
					alt16=1;
				}
				else if ( (true) ) {
					alt16=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// T.g:68:25: (e1= expression ( ',' e2= expression )* )
					{
					// T.g:68:25: (e1= expression ( ',' e2= expression )* )
					// T.g:68:26: e1= expression ( ',' e2= expression )*
					{
					pushFollow(FOLLOW_expression_in_tuple_tail2187);
					e1=expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {PT.tupleCreate(id_tuple_tail, (e1!=null?((TParser.expression_return)e1).exp_val:null));}
					// T.g:69:25: ( ',' e2= expression )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==12) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// T.g:69:27: ',' e2= expression
							{
							match(input,12,FOLLOW_12_in_tuple_tail2240); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_tuple_tail2246);
							e2=expression();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {PT.tupleCreate(id_tuple_tail, (e2!=null?((TParser.expression_return)e2).exp_val:null));}
							}
							break;

						default :
							break loop15;
						}
					}

					}

					}
					break;
				case 2 :
					// T.g:72:25: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tuple_tail"


	public static class string_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "string"
	// T.g:74:1: string : ( '\"' (~ ( '\"' ) )* '\"' ) ;
	public final TParser.string_return string() throws RecognitionException {
		TParser.string_return retval = new TParser.string_return();
		retval.start = input.LT(1);

		try {
			// T.g:74:7: ( ( '\"' (~ ( '\"' ) )* '\"' ) )
			// T.g:74:11: ( '\"' (~ ( '\"' ) )* '\"' )
			{
			// T.g:74:11: ( '\"' (~ ( '\"' ) )* '\"' )
			// T.g:74:12: '\"' (~ ( '\"' ) )* '\"'
			{
			match(input,8,FOLLOW_8_in_string2355); if (state.failed) return retval;
			// T.g:74:16: (~ ( '\"' ) )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= COMMENTS && LA17_0 <= WS)||(LA17_0 >= 9 && LA17_0 <= 17)) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// T.g:
					{
					if ( (input.LA(1) >= COMMENTS && input.LA(1) <= WS)||(input.LA(1) >= 9 && input.LA(1) <= 17) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop17;
				}
			}

			match(input,8,FOLLOW_8_in_string2365); if (state.failed) return retval;
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string"



	// $ANTLR start "tuple_unpack"
	// T.g:77:1: tuple_unpack : '(' e1= expression ( ',' e2= expression )* ')' '=' i1= ID ;
	public final void tuple_unpack() throws RecognitionException {
		Token i1=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		try {
			// T.g:77:13: ( '(' e1= expression ( ',' e2= expression )* ')' '=' i1= ID )
			// T.g:77:17: '(' e1= expression ( ',' e2= expression )* ')' '=' i1= ID
			{
			match(input,9,FOLLOW_9_in_tuple_unpack2416); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_tuple_unpack2422);
			e1=expression();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {PT.unpackSet((e1!=null?((TParser.expression_return)e1).exp_val:null));}
			// T.g:78:17: ( ',' e2= expression )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==12) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// T.g:78:19: ',' e2= expression
					{
					match(input,12,FOLLOW_12_in_tuple_unpack2472); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_tuple_unpack2478);
					e2=expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {PT.unpackSet((e2!=null?((TParser.expression_return)e2).exp_val:null));}
					}
					break;

				default :
					break loop18;
				}
			}

			match(input,10,FOLLOW_10_in_tuple_unpack2543); if (state.failed) return;
			match(input,14,FOLLOW_14_in_tuple_unpack2545); if (state.failed) return;
			i1=(Token)match(input,ID,FOLLOW_ID_in_tuple_unpack2553); if (state.failed) return;
			if ( state.backtracking==0 ) {PT.unpackCreate((i1!=null?i1.getText():null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tuple_unpack"



	// $ANTLR start "print"
	// T.g:84:1: print : 'print(' e1= expression ( ',' e2= expression )* ')' ;
	public final void print() throws RecognitionException {
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		try {
			// T.g:84:6: ( 'print(' e1= expression ( ',' e2= expression )* ')' )
			// T.g:84:17: 'print(' e1= expression ( ',' e2= expression )* ')'
			{
			match(input,17,FOLLOW_17_in_print2600); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_print2606);
			e1=expression();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {System.out.println((e1!=null?((TParser.expression_return)e1).exp_val:null));}
			// T.g:85:17: ( ',' e2= expression )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==12) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// T.g:85:18: ',' e2= expression
					{
					match(input,12,FOLLOW_12_in_print2647); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_print2653);
					e2=expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.println((e2!=null?((TParser.expression_return)e2).exp_val:null));}
					}
					break;

				default :
					break loop19;
				}
			}

			match(input,10,FOLLOW_10_in_print2719); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print"

	// $ANTLR start synpred3_T
	public final void synpred3_T_fragment() throws RecognitionException {
		// T.g:19:39: ( print )
		// T.g:19:39: print
		{
		pushFollow(FOLLOW_print_in_synpred3_T559);
		print();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_T

	// $ANTLR start synpred6_T
	public final void synpred6_T_fragment() throws RecognitionException {
		Token x=null;
		Token int1=null;
		Token int2=null;

		// T.g:22:25: (x= ID '=' int1= INT ( '+' int2= INT )* )
		// T.g:22:25: x= ID '=' int1= INT ( '+' int2= INT )*
		{
		x=(Token)match(input,ID,FOLLOW_ID_in_synpred6_T613); if (state.failed) return;
		match(input,14,FOLLOW_14_in_synpred6_T615); if (state.failed) return;
		int1=(Token)match(input,INT,FOLLOW_INT_in_synpred6_T621); if (state.failed) return;
		// T.g:23:25: ( '+' int2= INT )*
		loop21:
		while (true) {
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==11) ) {
				alt21=1;
			}

			switch (alt21) {
			case 1 :
				// T.g:23:26: '+' int2= INT
				{
				match(input,11,FOLLOW_11_in_synpred6_T676); if (state.failed) return;
				int2=(Token)match(input,INT,FOLLOW_INT_in_synpred6_T682); if (state.failed) return;
				}
				break;

			default :
				break loop21;
			}
		}

		}

	}
	// $ANTLR end synpred6_T

	// $ANTLR start synpred8_T
	public final void synpred8_T_fragment() throws RecognitionException {
		Token y=null;
		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;

		// T.g:26:25: (y= ID '=' s1= string ( '+' s2= string )* )
		// T.g:26:25: y= ID '=' s1= string ( '+' s2= string )*
		{
		y=(Token)match(input,ID,FOLLOW_ID_in_synpred8_T800); if (state.failed) return;
		match(input,14,FOLLOW_14_in_synpred8_T802); if (state.failed) return;
		pushFollow(FOLLOW_string_in_synpred8_T808);
		s1=string();
		state._fsp--;
		if (state.failed) return;
		// T.g:27:25: ( '+' s2= string )*
		loop22:
		while (true) {
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==11) ) {
				alt22=1;
			}

			switch (alt22) {
			case 1 :
				// T.g:27:26: '+' s2= string
				{
				match(input,11,FOLLOW_11_in_synpred8_T862); if (state.failed) return;
				pushFollow(FOLLOW_string_in_synpred8_T868);
				s2=string();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop22;
			}
		}

		}

	}
	// $ANTLR end synpred8_T

	// $ANTLR start synpred9_T
	public final void synpred9_T_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;

		// T.g:32:26: (e2= expression )
		// T.g:32:26: e2= expression
		{
		pushFollow(FOLLOW_expression_in_synpred9_T1027);
		e2=expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_T

	// $ANTLR start synpred10_T
	public final void synpred10_T_fragment() throws RecognitionException {
		Token i0=null;
		Token i1=null;
		ParserRuleReturnScope e2 =null;

		// T.g:31:25: (i0= ID '[' i1= INT ']' '=' (e2= expression |t= tuple[$e2.text] ) )
		// T.g:31:25: i0= ID '[' i1= INT ']' '=' (e2= expression |t= tuple[$e2.text] )
		{
		i0=(Token)match(input,ID,FOLLOW_ID_in_synpred10_T984); if (state.failed) return;
		match(input,15,FOLLOW_15_in_synpred10_T986); if (state.failed) return;
		i1=(Token)match(input,INT,FOLLOW_INT_in_synpred10_T992); if (state.failed) return;
		match(input,16,FOLLOW_16_in_synpred10_T994); if (state.failed) return;
		match(input,14,FOLLOW_14_in_synpred10_T996); if (state.failed) return;
		// T.g:32:25: (e2= expression |t= tuple[$e2.text] )
		int alt23=2;
		int LA23_0 = input.LA(1);
		if ( (LA23_0==EOF||(LA23_0 >= ID && LA23_0 <= INT)||LA23_0==8) ) {
			alt23=1;
		}
		else if ( (LA23_0==9) ) {
			alt23=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 23, 0, input);
			throw nvae;
		}

		switch (alt23) {
			case 1 :
				// T.g:32:26: e2= expression
				{
				pushFollow(FOLLOW_expression_in_synpred10_T1027);
				e2=expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;
			case 2 :
				// T.g:34:25: t= tuple[$e2.text]
				{
				pushFollow(FOLLOW_tuple_in_synpred10_T1117);
				tuple((e2!=null?input.toString(e2.start,e2.stop):null));
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred10_T

	// $ANTLR start synpred17_T
	public final void synpred17_T_fragment() throws RecognitionException {
		Token i1=null;
		Token f=null;
		Token i2=null;
		Token i3=null;
		Token i4=null;
		Token start=null;
		Token stop=null;

		// T.g:37:25: (i1= ID f= '=' (i2= ID ( '+' i3= ID )* |i4= ID '[' (start= INT )? ':' (stop= INT )? ']' | tuple[$i1.text] ( '+' tuple[$f.text] )* ) )
		// T.g:37:25: i1= ID f= '=' (i2= ID ( '+' i3= ID )* |i4= ID '[' (start= INT )? ':' (stop= INT )? ']' | tuple[$i1.text] ( '+' tuple[$f.text] )* )
		{
		i1=(Token)match(input,ID,FOLLOW_ID_in_synpred17_T1212); if (state.failed) return;
		f=(Token)match(input,14,FOLLOW_14_in_synpred17_T1218); if (state.failed) return;
		// T.g:38:25: (i2= ID ( '+' i3= ID )* |i4= ID '[' (start= INT )? ':' (stop= INT )? ']' | tuple[$i1.text] ( '+' tuple[$f.text] )* )
		int alt31=3;
		int LA31_0 = input.LA(1);
		if ( (LA31_0==ID) ) {
			int LA31_1 = input.LA(2);
			if ( (LA31_1==15) ) {
				alt31=2;
			}
			else if ( (LA31_1==EOF||LA31_1==11) ) {
				alt31=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 31, 1, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

		}
		else if ( (LA31_0==9) ) {
			alt31=3;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 31, 0, input);
			throw nvae;
		}

		switch (alt31) {
			case 1 :
				// T.g:38:27: i2= ID ( '+' i3= ID )*
				{
				i2=(Token)match(input,ID,FOLLOW_ID_in_synpred17_T1284); if (state.failed) return;
				// T.g:39:25: ( '+' i3= ID )*
				loop27:
				while (true) {
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==11) ) {
						alt27=1;
					}

					switch (alt27) {
					case 1 :
						// T.g:39:26: '+' i3= ID
						{
						match(input,11,FOLLOW_11_in_synpred17_T1351); if (state.failed) return;
						i3=(Token)match(input,ID,FOLLOW_ID_in_synpred17_T1357); if (state.failed) return;
						}
						break;

					default :
						break loop27;
					}
				}

				}
				break;
			case 2 :
				// T.g:42:25: i4= ID '[' (start= INT )? ':' (stop= INT )? ']'
				{
				i4=(Token)match(input,ID,FOLLOW_ID_in_synpred17_T1501); if (state.failed) return;
				match(input,15,FOLLOW_15_in_synpred17_T1503); if (state.failed) return;
				// T.g:42:37: (start= INT )?
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==INT) ) {
					alt28=1;
				}
				switch (alt28) {
					case 1 :
						// T.g:42:38: start= INT
						{
						start=(Token)match(input,INT,FOLLOW_INT_in_synpred17_T1508); if (state.failed) return;
						}
						break;

				}

				match(input,13,FOLLOW_13_in_synpred17_T1512); if (state.failed) return;
				// T.g:42:54: (stop= INT )?
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==INT) ) {
					alt29=1;
				}
				switch (alt29) {
					case 1 :
						// T.g:42:55: stop= INT
						{
						stop=(Token)match(input,INT,FOLLOW_INT_in_synpred17_T1517); if (state.failed) return;
						}
						break;

				}

				match(input,16,FOLLOW_16_in_synpred17_T1521); if (state.failed) return;
				}
				break;
			case 3 :
				// T.g:43:27: tuple[$i1.text] ( '+' tuple[$f.text] )*
				{
				pushFollow(FOLLOW_tuple_in_synpred17_T1554);
				tuple((i1!=null?i1.getText():null));
				state._fsp--;
				if (state.failed) return;
				// T.g:44:25: ( '+' tuple[$f.text] )*
				loop30:
				while (true) {
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==11) ) {
						alt30=1;
					}

					switch (alt30) {
					case 1 :
						// T.g:44:27: '+' tuple[$f.text]
						{
						match(input,11,FOLLOW_11_in_synpred17_T1584); if (state.failed) return;
						pushFollow(FOLLOW_tuple_in_synpred17_T1586);
						tuple((f!=null?f.getText():null));
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop30;
					}
				}

				}
				break;

		}

		}

	}
	// $ANTLR end synpred17_T

	// $ANTLR start synpred21_T
	public final void synpred21_T_fragment() throws RecognitionException {
		Token f=null;

		// T.g:57:13: (f= ID )
		// T.g:57:13: f= ID
		{
		f=(Token)match(input,ID,FOLLOW_ID_in_synpred21_T1930); if (state.failed) return;
		}

	}
	// $ANTLR end synpred21_T

	// $ANTLR start synpred22_T
	public final void synpred22_T_fragment() throws RecognitionException {
		Token i=null;
		ParserRuleReturnScope n =null;

		// T.g:58:27: (i= ID '[' n= expression ']' )
		// T.g:58:27: i= ID '[' n= expression ']'
		{
		i=(Token)match(input,ID,FOLLOW_ID_in_synpred22_T1982); if (state.failed) return;
		match(input,15,FOLLOW_15_in_synpred22_T1984); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred22_T1990);
		n=expression();
		state._fsp--;
		if (state.failed) return;
		match(input,16,FOLLOW_16_in_synpred22_T1992); if (state.failed) return;
		}

	}
	// $ANTLR end synpred22_T

	// $ANTLR start synpred23_T
	public final void synpred23_T_fragment() throws RecognitionException {
		Token h=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		// T.g:59:27: (h= ID '[' a= expression ':' b= expression ']' )
		// T.g:59:27: h= ID '[' a= expression ':' b= expression ']'
		{
		h=(Token)match(input,ID,FOLLOW_ID_in_synpred23_T2040); if (state.failed) return;
		match(input,15,FOLLOW_15_in_synpred23_T2042); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred23_T2048);
		a=expression();
		state._fsp--;
		if (state.failed) return;
		match(input,13,FOLLOW_13_in_synpred23_T2050); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred23_T2056);
		b=expression();
		state._fsp--;
		if (state.failed) return;
		match(input,16,FOLLOW_16_in_synpred23_T2058); if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_T

	// $ANTLR start synpred25_T
	public final void synpred25_T_fragment() throws RecognitionException {
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		// T.g:68:25: ( (e1= expression ( ',' e2= expression )* ) )
		// T.g:68:25: (e1= expression ( ',' e2= expression )* )
		{
		// T.g:68:25: (e1= expression ( ',' e2= expression )* )
		// T.g:68:26: e1= expression ( ',' e2= expression )*
		{
		pushFollow(FOLLOW_expression_in_synpred25_T2187);
		e1=expression();
		state._fsp--;
		if (state.failed) return;
		// T.g:69:25: ( ',' e2= expression )*
		loop32:
		while (true) {
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==12) ) {
				alt32=1;
			}

			switch (alt32) {
			case 1 :
				// T.g:69:27: ',' e2= expression
				{
				match(input,12,FOLLOW_12_in_synpred25_T2240); if (state.failed) return;
				pushFollow(FOLLOW_expression_in_synpred25_T2246);
				e2=expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop32;
			}
		}

		}

		}

	}
	// $ANTLR end synpred25_T

	// Delegated rules

	public final boolean synpred9_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred25_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred22_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred22_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_stat_in_prog514 = new BitSet(new long[]{0x0000000000020222L});
	public static final BitSet FOLLOW_assignment_in_stat554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_stat559 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_tuple_unpack_in_stat565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment613 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignment615 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_assignment621 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_assignment676 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_assignment682 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_assignment800 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignment802 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_string_in_assignment808 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_assignment862 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_string_in_assignment868 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_assignment984 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assignment986 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_assignment992 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_assignment994 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignment996 = new BitSet(new long[]{0x0000000000000360L});
	public static final BitSet FOLLOW_expression_in_assignment1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_assignment1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment1212 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignment1218 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_ID_in_assignment1284 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_assignment1351 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_assignment1357 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_assignment1501 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assignment1503 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_INT_in_assignment1508 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_assignment1512 = new BitSet(new long[]{0x0000000000010040L});
	public static final BitSet FOLLOW_INT_in_assignment1517 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_assignment1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_assignment1554 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_assignment1584 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_tuple_in_assignment1586 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_assignment1707 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignment1709 = new BitSet(new long[]{0x0000000000000960L});
	public static final BitSet FOLLOW_expression_in_assignment1715 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_assignment1765 = new BitSet(new long[]{0x0000000000000960L});
	public static final BitSet FOLLOW_expression_in_assignment1771 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_INT_in_expression1868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_expression1898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expression1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expression1982 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_expression1984 = new BitSet(new long[]{0x0000000000010160L});
	public static final BitSet FOLLOW_expression_in_expression1990 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_expression1992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expression2040 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_expression2042 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expression_in_expression2048 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_expression2050 = new BitSet(new long[]{0x0000000000010160L});
	public static final BitSet FOLLOW_expression_in_expression2056 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_expression2058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_tuple2118 = new BitSet(new long[]{0x0000000000001160L});
	public static final BitSet FOLLOW_tuple_tail_in_tuple2120 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_tuple2124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_tuple_tail2187 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_tuple_tail2240 = new BitSet(new long[]{0x0000000000001160L});
	public static final BitSet FOLLOW_expression_in_tuple_tail2246 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_8_in_string2355 = new BitSet(new long[]{0x000000000003FFF0L});
	public static final BitSet FOLLOW_8_in_string2365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_tuple_unpack2416 = new BitSet(new long[]{0x0000000000001560L});
	public static final BitSet FOLLOW_expression_in_tuple_unpack2422 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_12_in_tuple_unpack2472 = new BitSet(new long[]{0x0000000000001560L});
	public static final BitSet FOLLOW_expression_in_tuple_unpack2478 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_10_in_tuple_unpack2543 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_tuple_unpack2545 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_tuple_unpack2553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_print2600 = new BitSet(new long[]{0x0000000000001560L});
	public static final BitSet FOLLOW_expression_in_print2606 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_12_in_print2647 = new BitSet(new long[]{0x0000000000001560L});
	public static final BitSet FOLLOW_expression_in_print2653 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_10_in_print2719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_synpred3_T559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred6_T613 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_synpred6_T615 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_synpred6_T621 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_synpred6_T676 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_synpred6_T682 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_synpred8_T800 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_synpred8_T802 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_string_in_synpred8_T808 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_synpred8_T862 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_string_in_synpred8_T868 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_expression_in_synpred9_T1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred10_T984 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_synpred10_T986 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_synpred10_T992 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_synpred10_T994 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_synpred10_T996 = new BitSet(new long[]{0x0000000000000360L});
	public static final BitSet FOLLOW_expression_in_synpred10_T1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_synpred10_T1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred17_T1212 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_synpred17_T1218 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_ID_in_synpred17_T1284 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_synpred17_T1351 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_synpred17_T1357 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_synpred17_T1501 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_synpred17_T1503 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_INT_in_synpred17_T1508 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_synpred17_T1512 = new BitSet(new long[]{0x0000000000010040L});
	public static final BitSet FOLLOW_INT_in_synpred17_T1517 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_synpred17_T1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_synpred17_T1554 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_synpred17_T1584 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_tuple_in_synpred17_T1586 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_synpred21_T1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred22_T1982 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_synpred22_T1984 = new BitSet(new long[]{0x0000000000010160L});
	public static final BitSet FOLLOW_expression_in_synpred22_T1990 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_synpred22_T1992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred23_T2040 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_synpred23_T2042 = new BitSet(new long[]{0x0000000000002160L});
	public static final BitSet FOLLOW_expression_in_synpred23_T2048 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_synpred23_T2050 = new BitSet(new long[]{0x0000000000010160L});
	public static final BitSet FOLLOW_expression_in_synpred23_T2056 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_synpred23_T2058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred25_T2187 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_synpred25_T2240 = new BitSet(new long[]{0x0000000000001160L});
	public static final BitSet FOLLOW_expression_in_synpred25_T2246 = new BitSet(new long[]{0x0000000000001002L});
}
