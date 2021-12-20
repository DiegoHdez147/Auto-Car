/* The following code was generated by JFlex 1.4.3 on 20/12/21 3:49 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 20/12/21 3:49 from the specification file
 * <tt>C:/Auto-Car/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\54\2\0\1\5\22\0\1\5\1\42\1\0\1\47"+
    "\1\3\1\0\1\41\1\0\1\44\1\46\1\53\1\57\1\50\1\60"+
    "\1\4\1\55\1\52\1\51\10\2\1\56\1\0\1\36\1\35\1\37"+
    "\2\0\1\14\1\26\1\10\1\22\1\21\1\12\1\24\1\23\1\6"+
    "\1\34\1\1\1\25\1\33\1\7\1\11\1\13\1\17\1\15\1\30"+
    "\1\31\1\20\1\27\1\1\1\32\1\1\1\16\1\43\1\0\1\45"+
    "\1\0\1\1\1\0\32\1\1\0\1\40\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\1\2\1\4\1\5\20\3"+
    "\1\2\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\0\1\4\1\31\43\3"+
    "\1\32\1\33\1\34\1\35\1\0\1\5\1\0\1\36"+
    "\1\31\12\3\1\37\23\3\1\40\5\3\1\41\3\3"+
    "\2\0\33\3\1\42\17\3\1\4\1\5\5\3\1\43"+
    "\1\44\4\3\1\45\1\46\1\47\3\3\1\50\14\3"+
    "\1\51\3\3\1\52\4\3\1\53\2\3\1\54\5\3"+
    "\1\55\1\56\1\57\4\3\1\60\1\61\3\3\1\62"+
    "\1\3\1\63\3\3\1\64\1\65\2\3\1\66\2\3"+
    "\1\67\2\3\1\70\1\3\1\71\3\3\1\72\1\73"+
    "\1\74\1\3\1\75\1\76\1\77\1\100\1\3\1\101"+
    "\2\3\1\102\1\103\1\3\1\104\6\3\1\105\1\106"+
    "\1\107\1\110\2\3\1\111\1\112\1\113\1\114";

  private static int [] zzUnpackAction() {
    int [] result = new int[291];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
    "\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae\0\u02df"+
    "\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u0436\0\u0467"+
    "\0\u0498\0\u04c9\0\61\0\61\0\61\0\61\0\u04fa\0\61"+
    "\0\61\0\61\0\u0126\0\223\0\223\0\u052b\0\61\0\61"+
    "\0\61\0\61\0\u055c\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0651"+
    "\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0746\0\u0777\0\u07a8\0\u07d9"+
    "\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0961"+
    "\0\u0992\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9"+
    "\0\u0b1a\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f\0\u0c40\0\u0c71"+
    "\0\u0ca2\0\61\0\61\0\61\0\61\0\u0cd3\0\u0d04\0\u0d35"+
    "\0\u0d66\0\u0d97\0\u0dc8\0\u0df9\0\u0e2a\0\u0e5b\0\u0e8c\0\u0ebd"+
    "\0\u0eee\0\u0f1f\0\u0f50\0\u0f81\0\142\0\u0fb2\0\u0fe3\0\u1014"+
    "\0\u1045\0\u1076\0\u10a7\0\u10d8\0\u1109\0\u113a\0\u116b\0\u119c"+
    "\0\u11cd\0\u11fe\0\u122f\0\u1260\0\u1291\0\u12c2\0\u12f3\0\u1324"+
    "\0\142\0\u1355\0\u1386\0\u13b7\0\u13e8\0\u1419\0\u144a\0\u147b"+
    "\0\u14ac\0\u14dd\0\u150e\0\u153f\0\u1570\0\u15a1\0\u15d2\0\u1603"+
    "\0\u1634\0\u1665\0\u1696\0\u16c7\0\u16f8\0\u1729\0\u175a\0\u178b"+
    "\0\u17bc\0\u17ed\0\u181e\0\u184f\0\u1880\0\u18b1\0\u18e2\0\u1913"+
    "\0\u1944\0\u1975\0\u19a6\0\u19d7\0\u1a08\0\u1a39\0\u1a6a\0\142"+
    "\0\u1a9b\0\u1acc\0\u1afd\0\u1b2e\0\u1b5f\0\u1b90\0\u1bc1\0\u1bf2"+
    "\0\u1c23\0\u1c54\0\u1c85\0\u1cb6\0\u1ce7\0\u1d18\0\u1d49\0\61"+
    "\0\u0d35\0\u1d7a\0\u1dab\0\u1ddc\0\u1e0d\0\u1e3e\0\142\0\142"+
    "\0\u1e6f\0\u1ea0\0\u1ed1\0\u1f02\0\142\0\142\0\142\0\u1f33"+
    "\0\u1f64\0\u1f95\0\142\0\u1fc6\0\u1ff7\0\u2028\0\u2059\0\u208a"+
    "\0\u20bb\0\u20ec\0\u211d\0\u214e\0\u217f\0\u21b0\0\u21e1\0\142"+
    "\0\u2212\0\u2243\0\u2274\0\142\0\u22a5\0\u22d6\0\u2307\0\u2338"+
    "\0\142\0\u2369\0\u239a\0\142\0\u23cb\0\u23fc\0\u242d\0\u245e"+
    "\0\u248f\0\142\0\142\0\142\0\u24c0\0\u24f1\0\u2522\0\u2553"+
    "\0\142\0\142\0\u2584\0\u25b5\0\u25e6\0\142\0\u2617\0\142"+
    "\0\u2648\0\u2679\0\u26aa\0\142\0\142\0\u26db\0\u270c\0\142"+
    "\0\u273d\0\u276e\0\142\0\u279f\0\u27d0\0\142\0\u2801\0\142"+
    "\0\u2832\0\u2863\0\u2894\0\142\0\142\0\142\0\u28c5\0\142"+
    "\0\142\0\142\0\142\0\u28f6\0\142\0\u2927\0\u2958\0\142"+
    "\0\142\0\u2989\0\142\0\u29ba\0\u29eb\0\u2a1c\0\u2a4d\0\u2a7e"+
    "\0\u2aaf\0\142\0\142\0\142\0\142\0\u2ae0\0\u2b11\0\142"+
    "\0\142\0\142\0\142";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[291];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\3\3\1\20"+
    "\1\21\1\3\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\3\3\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\7\1\47\1\50\1\51\1\52\62\0\2\3\3\0"+
    "\27\3\14\0\2\3\7\0\1\3\1\4\1\0\1\6"+
    "\1\0\27\3\14\0\2\4\7\0\1\53\1\0\1\54"+
    "\2\0\27\53\26\0\1\55\1\0\1\56\44\0\2\55"+
    "\13\0\1\7\42\0\1\7\3\0\1\7\5\0\2\3"+
    "\3\0\1\3\1\57\6\3\1\60\16\3\14\0\2\3"+
    "\7\0\2\3\3\0\1\61\2\3\1\62\23\3\14\0"+
    "\2\3\7\0\2\3\3\0\1\63\2\3\1\64\2\3"+
    "\1\65\4\3\1\66\13\3\14\0\2\3\7\0\2\3"+
    "\3\0\5\3\1\67\5\3\1\70\13\3\14\0\2\3"+
    "\7\0\2\3\3\0\1\71\5\3\1\72\20\3\14\0"+
    "\2\3\7\0\2\3\3\0\6\3\1\73\1\74\17\3"+
    "\14\0\2\3\7\0\2\3\3\0\1\3\1\75\16\3"+
    "\1\76\1\77\5\3\14\0\2\3\7\0\2\3\3\0"+
    "\3\3\1\100\6\3\1\101\1\102\13\3\14\0\2\3"+
    "\7\0\2\3\3\0\1\3\1\103\17\3\1\104\1\105"+
    "\4\3\14\0\2\3\7\0\2\3\3\0\1\106\12\3"+
    "\1\107\13\3\14\0\2\3\7\0\2\3\3\0\1\110"+
    "\5\3\1\111\20\3\14\0\2\3\7\0\2\3\3\0"+
    "\12\3\1\112\14\3\14\0\2\3\7\0\2\3\3\0"+
    "\3\3\1\113\2\3\1\114\20\3\14\0\2\3\7\0"+
    "\2\3\3\0\13\3\1\115\13\3\14\0\2\3\7\0"+
    "\2\3\3\0\6\3\1\116\3\3\1\117\1\120\13\3"+
    "\14\0\2\3\7\0\2\3\3\0\7\3\1\121\17\3"+
    "\14\0\2\3\43\0\1\122\60\0\1\123\1\0\1\124"+
    "\56\0\1\125\103\0\1\126\53\0\1\127\1\0\1\130"+
    "\4\0\2\53\3\0\27\53\14\0\2\53\7\0\1\131"+
    "\1\0\1\54\2\0\27\131\26\0\1\55\46\0\2\55"+
    "\10\0\1\132\1\0\1\56\44\0\2\132\7\0\2\3"+
    "\3\0\1\133\26\3\14\0\2\3\7\0\2\3\3\0"+
    "\11\3\1\134\15\3\14\0\2\3\7\0\2\3\3\0"+
    "\1\3\1\135\25\3\14\0\2\3\7\0\2\3\3\0"+
    "\7\3\1\136\17\3\14\0\2\3\7\0\2\3\3\0"+
    "\2\3\1\137\24\3\14\0\2\3\7\0\2\3\3\0"+
    "\1\3\1\140\25\3\14\0\2\3\7\0\2\3\3\0"+
    "\20\3\1\141\6\3\14\0\2\3\7\0\2\3\3\0"+
    "\7\3\1\142\17\3\14\0\2\3\7\0\2\3\3\0"+
    "\2\3\1\143\24\3\14\0\2\3\7\0\2\3\3\0"+
    "\22\3\1\144\4\3\14\0\2\3\7\0\2\3\3\0"+
    "\1\3\1\145\25\3\14\0\2\3\7\0\2\3\3\0"+
    "\17\3\1\146\7\3\14\0\2\3\7\0\2\3\3\0"+
    "\7\3\1\147\17\3\14\0\2\3\7\0\2\3\3\0"+
    "\1\150\2\3\1\151\23\3\14\0\2\3\7\0\2\3"+
    "\3\0\6\3\1\152\20\3\14\0\2\3\7\0\2\3"+
    "\3\0\7\3\1\153\17\3\14\0\2\3\7\0\2\3"+
    "\3\0\6\3\1\154\20\3\14\0\2\3\7\0\2\3"+
    "\3\0\25\3\1\155\1\3\14\0\2\3\7\0\2\3"+
    "\3\0\13\3\1\156\13\3\14\0\2\3\7\0\2\3"+
    "\3\0\5\3\1\157\15\3\1\160\3\3\14\0\2\3"+
    "\7\0\2\3\3\0\23\3\1\161\3\3\14\0\2\3"+
    "\7\0\2\3\3\0\6\3\1\162\20\3\14\0\2\3"+
    "\7\0\2\3\3\0\23\3\1\163\3\3\14\0\2\3"+
    "\7\0\2\3\3\0\16\3\1\164\10\3\14\0\2\3"+
    "\7\0\2\3\3\0\7\3\1\165\7\3\1\166\7\3"+
    "\14\0\2\3\7\0\2\3\3\0\7\3\1\167\17\3"+
    "\14\0\2\3\7\0\2\3\3\0\1\3\1\170\25\3"+
    "\14\0\2\3\7\0\2\3\3\0\10\3\1\171\16\3"+
    "\14\0\2\3\7\0\2\3\3\0\2\3\1\172\24\3"+
    "\14\0\2\3\7\0\2\3\3\0\1\3\1\173\24\3"+
    "\1\174\14\0\2\3\7\0\2\3\3\0\7\3\1\175"+
    "\17\3\14\0\2\3\7\0\2\3\3\0\17\3\1\176"+
    "\7\3\14\0\2\3\7\0\2\3\3\0\7\3\1\177"+
    "\10\3\1\200\6\3\14\0\2\3\7\0\2\3\3\0"+
    "\1\3\1\201\25\3\14\0\2\3\7\0\2\3\3\0"+
    "\6\3\1\202\20\3\14\0\2\3\10\0\1\203\46\0"+
    "\2\203\6\0\54\127\1\0\4\127\54\130\1\0\1\204"+
    "\3\130\1\0\2\131\3\0\27\131\14\0\2\131\10\0"+
    "\1\132\46\0\2\132\7\0\2\3\3\0\2\3\1\205"+
    "\24\3\14\0\2\3\7\0\2\3\3\0\12\3\1\206"+
    "\14\3\14\0\2\3\7\0\2\3\3\0\16\3\1\207"+
    "\10\3\14\0\2\3\7\0\2\3\3\0\3\3\1\210"+
    "\7\3\1\211\7\3\1\212\3\3\14\0\2\3\7\0"+
    "\2\3\3\0\17\3\1\213\7\3\14\0\2\3\7\0"+
    "\2\3\3\0\14\3\1\214\12\3\14\0\2\3\7\0"+
    "\2\3\3\0\1\215\26\3\14\0\2\3\7\0\2\3"+
    "\3\0\7\3\1\216\17\3\14\0\2\3\7\0\2\3"+
    "\3\0\1\217\26\3\14\0\2\3\7\0\2\3\3\0"+
    "\23\3\1\220\3\3\14\0\2\3\7\0\2\3\3\0"+
    "\22\3\1\221\4\3\14\0\2\3\7\0\2\3\3\0"+
    "\6\3\1\222\20\3\14\0\2\3\7\0\2\3\3\0"+
    "\1\3\1\223\25\3\14\0\2\3\7\0\2\3\3\0"+
    "\24\3\1\224\2\3\14\0\2\3\7\0\2\3\3\0"+
    "\17\3\1\225\7\3\14\0\2\3\7\0\2\3\3\0"+
    "\1\226\26\3\14\0\2\3\7\0\2\3\3\0\1\3"+
    "\1\227\25\3\14\0\2\3\7\0\2\3\3\0\5\3"+
    "\1\230\21\3\14\0\2\3\7\0\2\3\3\0\14\3"+
    "\1\231\12\3\14\0\2\3\7\0\2\3\3\0\13\3"+
    "\1\232\13\3\14\0\2\3\7\0\2\3\3\0\7\3"+
    "\1\233\17\3\14\0\2\3\7\0\2\3\3\0\7\3"+
    "\1\234\3\3\1\235\13\3\14\0\2\3\7\0\2\3"+
    "\3\0\17\3\1\236\7\3\14\0\2\3\7\0\2\3"+
    "\3\0\6\3\1\237\4\3\1\240\13\3\14\0\2\3"+
    "\7\0\2\3\3\0\1\241\26\3\14\0\2\3\7\0"+
    "\2\3\3\0\13\3\1\242\13\3\14\0\2\3\7\0"+
    "\2\3\3\0\6\3\1\243\20\3\14\0\2\3\7\0"+
    "\2\3\3\0\6\3\1\244\20\3\14\0\2\3\7\0"+
    "\2\3\3\0\2\3\1\245\24\3\14\0\2\3\7\0"+
    "\2\3\3\0\1\246\26\3\14\0\2\3\7\0\2\3"+
    "\3\0\14\3\1\247\12\3\14\0\2\3\7\0\2\3"+
    "\3\0\6\3\1\250\20\3\14\0\2\3\7\0\2\3"+
    "\3\0\14\3\1\251\12\3\14\0\2\3\7\0\2\3"+
    "\3\0\1\252\26\3\14\0\2\3\7\0\2\3\3\0"+
    "\3\3\1\253\7\3\1\254\13\3\14\0\2\3\7\0"+
    "\2\3\3\0\1\255\26\3\14\0\2\3\7\0\2\3"+
    "\3\0\22\3\1\256\4\3\14\0\2\3\7\0\2\3"+
    "\3\0\22\3\1\257\4\3\14\0\2\3\10\0\1\203"+
    "\43\0\1\260\2\0\2\203\6\0\53\130\1\261\1\0"+
    "\1\204\3\130\1\0\2\3\3\0\1\262\26\3\14\0"+
    "\2\3\7\0\2\3\3\0\1\263\26\3\14\0\2\3"+
    "\7\0\2\3\3\0\12\3\1\264\14\3\14\0\2\3"+
    "\7\0\2\3\3\0\13\3\1\265\13\3\14\0\2\3"+
    "\7\0\2\3\3\0\22\3\1\266\4\3\14\0\2\3"+
    "\7\0\2\3\3\0\13\3\1\267\13\3\14\0\2\3"+
    "\7\0\2\3\3\0\3\3\1\270\23\3\14\0\2\3"+
    "\7\0\2\3\3\0\1\271\26\3\14\0\2\3\7\0"+
    "\2\3\3\0\1\3\1\272\25\3\14\0\2\3\7\0"+
    "\2\3\3\0\6\3\1\273\20\3\14\0\2\3\7\0"+
    "\2\3\3\0\3\3\1\274\23\3\14\0\2\3\7\0"+
    "\2\3\3\0\13\3\1\275\13\3\14\0\2\3\7\0"+
    "\2\3\3\0\3\3\1\276\23\3\14\0\2\3\7\0"+
    "\2\3\3\0\7\3\1\277\17\3\14\0\2\3\7\0"+
    "\2\3\3\0\2\3\1\300\24\3\14\0\2\3\7\0"+
    "\2\3\3\0\1\301\26\3\14\0\2\3\7\0\2\3"+
    "\3\0\3\3\1\302\23\3\14\0\2\3\7\0\2\3"+
    "\3\0\7\3\1\303\17\3\14\0\2\3\7\0\2\3"+
    "\3\0\10\3\1\304\16\3\14\0\2\3\7\0\2\3"+
    "\3\0\13\3\1\305\13\3\14\0\2\3\7\0\2\3"+
    "\3\0\6\3\1\306\20\3\14\0\2\3\7\0\2\3"+
    "\3\0\23\3\1\307\3\3\14\0\2\3\7\0\2\3"+
    "\3\0\3\3\1\310\23\3\14\0\2\3\7\0\2\3"+
    "\3\0\6\3\1\311\20\3\14\0\2\3\7\0\2\3"+
    "\3\0\7\3\1\312\17\3\14\0\2\3\7\0\2\3"+
    "\3\0\12\3\1\313\14\3\14\0\2\3\7\0\2\3"+
    "\3\0\14\3\1\314\12\3\14\0\2\3\7\0\2\3"+
    "\3\0\23\3\1\315\3\3\14\0\2\3\7\0\2\3"+
    "\3\0\2\3\1\316\24\3\14\0\2\3\7\0\2\3"+
    "\3\0\1\3\1\317\25\3\14\0\2\3\7\0\2\3"+
    "\3\0\7\3\1\320\17\3\14\0\2\3\7\0\2\3"+
    "\3\0\15\3\1\321\11\3\14\0\2\3\7\0\2\3"+
    "\3\0\1\3\1\322\25\3\14\0\2\3\7\0\2\3"+
    "\3\0\13\3\1\323\13\3\14\0\2\3\7\0\2\3"+
    "\3\0\7\3\1\324\17\3\14\0\2\3\7\0\2\3"+
    "\3\0\6\3\1\325\20\3\14\0\2\3\7\0\2\3"+
    "\3\0\14\3\1\326\12\3\14\0\2\3\7\0\2\3"+
    "\3\0\13\3\1\327\13\3\14\0\2\3\7\0\2\3"+
    "\3\0\22\3\1\330\4\3\14\0\2\3\7\0\2\3"+
    "\3\0\7\3\1\331\17\3\14\0\2\3\7\0\2\3"+
    "\3\0\3\3\1\332\23\3\14\0\2\3\7\0\2\3"+
    "\3\0\13\3\1\333\13\3\14\0\2\3\7\0\2\3"+
    "\3\0\3\3\1\334\23\3\14\0\2\3\7\0\2\3"+
    "\3\0\13\3\1\335\13\3\14\0\2\3\7\0\2\3"+
    "\3\0\1\3\1\336\25\3\14\0\2\3\7\0\2\3"+
    "\3\0\22\3\1\337\4\3\14\0\2\3\7\0\2\3"+
    "\3\0\23\3\1\340\3\3\14\0\2\3\7\0\2\3"+
    "\3\0\2\3\1\341\24\3\14\0\2\3\7\0\2\3"+
    "\3\0\6\3\1\342\20\3\14\0\2\3\7\0\2\3"+
    "\3\0\7\3\1\343\17\3\14\0\2\3\7\0\2\3"+
    "\3\0\1\3\1\344\25\3\14\0\2\3\7\0\2\3"+
    "\3\0\1\345\26\3\14\0\2\3\7\0\2\3\3\0"+
    "\25\3\1\346\1\3\14\0\2\3\7\0\2\3\3\0"+
    "\16\3\1\347\10\3\14\0\2\3\7\0\2\3\3\0"+
    "\6\3\1\350\20\3\14\0\2\3\7\0\2\3\3\0"+
    "\7\3\1\351\17\3\14\0\2\3\7\0\2\3\3\0"+
    "\22\3\1\352\4\3\14\0\2\3\7\0\2\3\3\0"+
    "\1\353\26\3\14\0\2\3\7\0\2\3\3\0\2\3"+
    "\1\354\24\3\14\0\2\3\7\0\2\3\3\0\14\3"+
    "\1\355\12\3\14\0\2\3\7\0\2\3\3\0\3\3"+
    "\1\356\23\3\14\0\2\3\7\0\2\3\3\0\6\3"+
    "\1\357\20\3\14\0\2\3\7\0\2\3\3\0\3\3"+
    "\1\360\23\3\14\0\2\3\7\0\2\3\3\0\6\3"+
    "\1\361\20\3\14\0\2\3\7\0\2\3\3\0\15\3"+
    "\1\362\11\3\14\0\2\3\7\0\2\3\3\0\23\3"+
    "\1\363\3\3\14\0\2\3\7\0\2\3\3\0\3\3"+
    "\1\364\23\3\14\0\2\3\7\0\2\3\3\0\6\3"+
    "\1\365\20\3\14\0\2\3\7\0\2\3\3\0\7\3"+
    "\1\366\17\3\14\0\2\3\7\0\2\3\3\0\14\3"+
    "\1\367\12\3\14\0\2\3\7\0\2\3\3\0\6\3"+
    "\1\370\20\3\14\0\2\3\7\0\2\3\3\0\22\3"+
    "\1\371\4\3\14\0\2\3\7\0\2\3\3\0\23\3"+
    "\1\372\3\3\14\0\2\3\7\0\2\3\3\0\7\3"+
    "\1\373\17\3\14\0\2\3\7\0\2\3\3\0\7\3"+
    "\1\374\17\3\14\0\2\3\7\0\2\3\3\0\7\3"+
    "\1\375\17\3\14\0\2\3\7\0\2\3\3\0\3\3"+
    "\1\376\23\3\14\0\2\3\7\0\2\3\3\0\23\3"+
    "\1\377\3\3\14\0\2\3\7\0\2\3\3\0\13\3"+
    "\1\u0100\13\3\14\0\2\3\7\0\2\3\3\0\1\u0101"+
    "\26\3\14\0\2\3\7\0\2\3\3\0\5\3\1\u0102"+
    "\21\3\14\0\2\3\7\0\2\3\3\0\1\u0103\26\3"+
    "\14\0\2\3\7\0\2\3\3\0\3\3\1\u0104\23\3"+
    "\14\0\2\3\7\0\2\3\3\0\7\3\1\u0105\17\3"+
    "\14\0\2\3\7\0\2\3\3\0\7\3\1\u0106\17\3"+
    "\14\0\2\3\7\0\2\3\3\0\13\3\1\u0107\13\3"+
    "\14\0\2\3\7\0\2\3\3\0\6\3\1\u0108\20\3"+
    "\14\0\2\3\7\0\2\3\3\0\7\3\1\u0109\17\3"+
    "\14\0\2\3\7\0\2\3\3\0\17\3\1\u010a\7\3"+
    "\14\0\2\3\7\0\2\3\3\0\6\3\1\u010b\20\3"+
    "\14\0\2\3\7\0\2\3\3\0\13\3\1\u010c\13\3"+
    "\14\0\2\3\7\0\2\3\3\0\6\3\1\u010d\20\3"+
    "\14\0\2\3\7\0\2\3\3\0\13\3\1\u010e\13\3"+
    "\14\0\2\3\7\0\2\3\3\0\23\3\1\u010f\3\3"+
    "\14\0\2\3\7\0\2\3\3\0\13\3\1\u0110\13\3"+
    "\14\0\2\3\7\0\2\3\3\0\6\3\1\u0111\20\3"+
    "\14\0\2\3\7\0\2\3\3\0\14\3\1\u0112\12\3"+
    "\14\0\2\3\7\0\2\3\3\0\13\3\1\u0113\13\3"+
    "\14\0\2\3\7\0\2\3\3\0\3\3\1\u0114\23\3"+
    "\14\0\2\3\7\0\2\3\3\0\6\3\1\u0115\20\3"+
    "\14\0\2\3\7\0\2\3\3\0\14\3\1\u0116\12\3"+
    "\14\0\2\3\7\0\2\3\3\0\14\3\1\u0117\12\3"+
    "\14\0\2\3\7\0\2\3\3\0\7\3\1\u0118\17\3"+
    "\14\0\2\3\7\0\2\3\3\0\7\3\1\u0119\17\3"+
    "\14\0\2\3\7\0\2\3\3\0\13\3\1\u011a\13\3"+
    "\14\0\2\3\7\0\2\3\3\0\6\3\1\u011b\20\3"+
    "\14\0\2\3\7\0\2\3\3\0\1\3\1\u011c\25\3"+
    "\14\0\2\3\7\0\2\3\3\0\17\3\1\u011d\7\3"+
    "\14\0\2\3\7\0\2\3\3\0\6\3\1\u011e\20\3"+
    "\14\0\2\3\7\0\2\3\3\0\13\3\1\u011f\13\3"+
    "\14\0\2\3\7\0\2\3\3\0\6\3\1\u0120\20\3"+
    "\14\0\2\3\7\0\2\3\3\0\3\3\1\u0121\23\3"+
    "\14\0\2\3\7\0\2\3\3\0\14\3\1\u0122\12\3"+
    "\14\0\2\3\7\0\2\3\3\0\7\3\1\u0123\17\3"+
    "\14\0\2\3\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11074];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\30\1\4\11\1\1\3\11\4\1\4\11"+
    "\1\1\1\0\45\1\4\11\1\0\1\1\1\0\52\1"+
    "\2\0\53\1\1\11\163\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[291];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 134) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 46: 
          { lexeme=yytext(); return CERRAR;
          }
        case 77: break;
        case 57: 
          { lexeme=yytext(); return NORESTE;
          }
        case 78: break;
        case 15: 
          { lexeme=yytext(); return FINLI;
          }
        case 79: break;
        case 54: 
          { lexeme=yytext(); return SALIDA;
          }
        case 80: break;
        case 24: 
          { lexeme=yytext(); return Identificador;
          }
        case 81: break;
        case 33: 
          { lexeme=yytext(); return SUR;
          }
        case 82: break;
        case 59: 
          { lexeme=yytext(); return AVANZAR;
          }
        case 83: break;
        case 9: 
          { lexeme=yytext(); return AND;
          }
        case 84: break;
        case 16: 
          { lexeme=yytext(); return COMILLA;
          }
        case 85: break;
        case 18: 
          { lexeme=yytext(); return CERO;
          }
        case 86: break;
        case 39: 
          { lexeme=yytext(); return PARAR;
          }
        case 87: break;
        case 23: 
          { return Resta;
          }
        case 88: break;
        case 43: 
          { lexeme=yytext(); return SUBIR;
          }
        case 89: break;
        case 41: 
          { lexeme=yytext(); return GIRAR;
          }
        case 90: break;
        case 62: 
          { lexeme=yytext(); return EVALUAR;
          }
        case 91: break;
        case 29: 
          { lexeme=yytext(); return MAYORIGUAL;
          }
        case 92: break;
        case 5: 
          { /*Ignore*/
          }
        case 93: break;
        case 13: 
          { lexeme=yytext(); return CORCHD;
          }
        case 94: break;
        case 52: 
          { lexeme=yytext(); return GANCHO;
          }
        case 95: break;
        case 25: 
          { lexeme=yytext(); return ERROR2;
          }
        case 96: break;
        case 26: 
          { lexeme=yytext(); return IGUALQUE;
          }
        case 97: break;
        case 50: 
          { lexeme=yytext(); return ENTERO;
          }
        case 98: break;
        case 38: 
          { lexeme=yytext(); return FALSO;
          }
        case 99: break;
        case 27: 
          { lexeme=yytext(); return MENORIGUAL;
          }
        case 100: break;
        case 36: 
          { lexeme=yytext(); return CICLO;
          }
        case 101: break;
        case 40: 
          { lexeme=yytext(); return ABRIR;
          }
        case 102: break;
        case 6: 
          { lexeme=yytext(); return MENOR;
          }
        case 103: break;
        case 66: 
          { lexeme=yytext(); return SURESTE;
          }
        case 104: break;
        case 7: 
          { lexeme=yytext(); return MAYOR;
          }
        case 105: break;
        case 3: 
          { lexeme=yytext(); return ERRORP;
          }
        case 106: break;
        case 2: 
          { return ERROR;
          }
        case 107: break;
        case 47: 
          { lexeme=yytext(); return OPCION;
          }
        case 108: break;
        case 51: 
          { lexeme=yytext(); return ESTADO;
          }
        case 109: break;
        case 30: 
          { lexeme=yytext(); return ERROR1;
          }
        case 110: break;
        case 11: 
          { lexeme=yytext(); return CORCHI;
          }
        case 111: break;
        case 55: 
          { lexeme=yytext(); return SENSOR;
          }
        case 112: break;
        case 67: 
          { lexeme=yytext(); return TRASERA;
          }
        case 113: break;
        case 68: 
          { lexeme=yytext(); return NOROESTE;
          }
        case 114: break;
        case 63: 
          { lexeme=yytext(); return DIGITAL;
          }
        case 115: break;
        case 74: 
          { lexeme=yytext(); return VERDAD;
          }
        case 116: break;
        case 45: 
          { lexeme=yytext(); return CABINA;
          }
        case 117: break;
        case 28: 
          { lexeme=yytext(); return DIFERENTEDE;
          }
        case 118: break;
        case 73: 
          { lexeme=yytext(); return DELANTERA;
          }
        case 119: break;
        case 32: 
          { lexeme=yytext(); return LUZ;
          }
        case 120: break;
        case 48: 
          { lexeme=yytext(); return ROMPER;
          }
        case 121: break;
        case 61: 
          { lexeme=yytext(); return ENTRADA;
          }
        case 122: break;
        case 75: 
          { lexeme=yytext(); return PROXIMIDAD;
          }
        case 123: break;
        case 34: 
          { lexeme=yytext(); return ESTE;
          }
        case 124: break;
        case 14: 
          { lexeme=yytext(); return PARENTESISD;
          }
        case 125: break;
        case 60: 
          { lexeme=yytext(); return REPETIR;
          }
        case 126: break;
        case 72: 
          { lexeme=yytext(); return PRINCIPAL;
          }
        case 127: break;
        case 53: 
          { lexeme=yytext(); return BOCINA;
          }
        case 128: break;
        case 70: 
          { lexeme=yytext(); return IZQUIERDA;
          }
        case 129: break;
        case 1: 
          { lexeme=yytext(); return NumeroEnt;
          }
        case 130: break;
        case 35: 
          { lexeme=yytext(); return NORTE;
          }
        case 131: break;
        case 49: 
          { lexeme=yytext(); return RUEDAS;
          }
        case 132: break;
        case 71: 
          { lexeme=yytext(); return CONDICION;
          }
        case 133: break;
        case 4: 
          { lexeme=yytext(); return Numero;
          }
        case 134: break;
        case 42: 
          { lexeme=yytext(); return BAJAR;
          }
        case 135: break;
        case 69: 
          { lexeme=yytext(); return SUROESTE;
          }
        case 136: break;
        case 20: 
          { return Division;
          }
        case 137: break;
        case 37: 
          { lexeme=yytext(); return OESTE;
          }
        case 138: break;
        case 31: 
          { lexeme=yytext(); return FIN;
          }
        case 139: break;
        case 56: 
          { lexeme=yytext(); return NINGUNO;
          }
        case 140: break;
        case 10: 
          { lexeme=yytext(); return NOT;
          }
        case 141: break;
        case 21: 
          { return Asignacion;
          }
        case 142: break;
        case 8: 
          { lexeme=yytext(); return OR;
          }
        case 143: break;
        case 17: 
          { lexeme=yytext(); return UNO;
          }
        case 144: break;
        case 44: 
          { lexeme=yytext(); return INICIO;
          }
        case 145: break;
        case 12: 
          { lexeme=yytext(); return PARENTESISI;
          }
        case 146: break;
        case 64: 
          { lexeme=yytext(); return DERECHA;
          }
        case 147: break;
        case 65: 
          { lexeme=yytext(); return BANDERA;
          }
        case 148: break;
        case 22: 
          { return Suma;
          }
        case 149: break;
        case 76: 
          { lexeme=yytext(); return RETROCEDER;
          }
        case 150: break;
        case 19: 
          { return Multiplicacion;
          }
        case 151: break;
        case 58: 
          { lexeme=yytext(); return ANALOGO;
          }
        case 152: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}