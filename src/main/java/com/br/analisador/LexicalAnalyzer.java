package com.br.analisador;/* The following code was generated by JFlex 1.6.1 */



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>/home/leonardo/Downloads/projectsjava/analisadorLexico/src/main/java/com/br/analisador/language.lex</tt>
 */
class LexicalAnalyzer {

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
    "\11\0\1\1\1\1\1\52\1\52\1\1\22\0\1\1\1\0\1\10"+
    "\1\0\1\35\3\0\1\26\1\27\1\37\2\0\1\14\1\15\1\0"+
    "\12\13\1\32\1\2\1\30\1\31\1\33\2\0\32\6\1\11\1\7"+
    "\1\11\1\34\2\11\1\23\1\42\1\45\1\5\1\21\1\22\1\40"+
    "\1\51\1\47\2\5\1\24\1\41\1\46\1\43\1\5\1\50\1\17"+
    "\1\25\1\16\1\20\1\44\4\5\1\3\1\36\1\4\7\0\1\52"+
    "\u05da\0\12\12\206\0\12\12\306\0\12\12\u019c\0\12\12\166\0\12\12"+
    "\166\0\12\12\166\0\12\12\166\0\12\12\166\0\12\12\166\0\12\12"+
    "\166\0\12\12\166\0\12\12\166\0\12\12\140\0\12\12\166\0\12\12"+
    "\106\0\12\12\u0116\0\12\12\106\0\12\12\u0746\0\12\12\46\0\12\12"+
    "\u012c\0\12\12\200\0\12\12\246\0\12\12\6\0\12\12\266\0\12\12"+
    "\126\0\12\12\206\0\12\12\6\0\12\12\u03ce\0\1\52\1\52\u85f6\0"+
    "\12\12\u02a6\0\12\12\46\0\12\12\306\0\12\12\26\0\12\12\126\0"+
    "\12\12\u0196\0\12\12\u5316\0\12\12\u0586\0\12\12\u0bbc\0\12\12\200\0"+
    "\12\12\74\0\12\12\220\0\12\12\u0116\0\12\12\u01d6\0\12\12\u0176\0"+
    "\12\12\146\0\12\12\u0216\0\12\12\u5176\0\12\12\346\0\12\12\u6c74\0"+
    "\62\12\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u280f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\1\5\1\1\1\6\1\7"+
    "\1\2\1\10\1\11\1\2\3\6\1\12\1\13\1\2"+
    "\1\14\3\2\1\3\1\2\2\6\1\15\1\1\1\6"+
    "\1\0\1\16\1\0\2\17\3\6\1\20\1\0\1\21"+
    "\1\22\2\0\1\23\1\24\1\25\5\6\1\26\1\27"+
    "\1\30\5\6\1\31\1\32\12\6\1\33\11\6\1\34"+
    "\2\6\1\35\5\6\1\36\1\37\1\40\4\6\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[98];
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
    "\0\0\0\53\0\53\0\53\0\126\0\201\0\254\0\53"+
    "\0\327\0\u0102\0\u012d\0\u0158\0\u0183\0\u01ae\0\u01d9\0\53"+
    "\0\53\0\u0204\0\u022f\0\u025a\0\u0285\0\u02b0\0\u02db\0\u0306"+
    "\0\u0331\0\u035c\0\53\0\53\0\u0387\0\u03b2\0\53\0\u0158"+
    "\0\u012d\0\u0158\0\u03dd\0\u0408\0\u0433\0\53\0\u045e\0\53"+
    "\0\53\0\u0489\0\u04b4\0\53\0\53\0\53\0\u04df\0\u050a"+
    "\0\u0535\0\u0560\0\u058b\0\53\0\53\0\53\0\u05b6\0\u05e1"+
    "\0\u060c\0\u0637\0\u0662\0\254\0\254\0\u068d\0\u06b8\0\u06e3"+
    "\0\u070e\0\u0739\0\u0764\0\u078f\0\u07ba\0\u07e5\0\u0810\0\254"+
    "\0\u083b\0\u0866\0\u0891\0\u08bc\0\u08e7\0\u0912\0\u093d\0\u0968"+
    "\0\u0993\0\254\0\u09be\0\u09e9\0\254\0\u0a14\0\u0a3f\0\u0a6a"+
    "\0\u0a95\0\u0ac0\0\254\0\254\0\254\0\u0aeb\0\u0b16\0\u0b41"+
    "\0\u0b6c\0\254";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[98];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\1\2\2\12\1\13\1\14\1\15\3\7\1\16"+
    "\2\7\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\2\1\26\1\27\1\30\1\31\5\7\1\32\3\7"+
    "\57\0\1\33\53\0\1\34\53\0\1\7\1\35\7\0"+
    "\10\7\12\0\12\7\6\0\3\36\1\37\1\36\1\0"+
    "\1\36\2\0\10\36\6\0\1\36\3\0\12\36\13\0"+
    "\2\12\1\0\1\40\47\0\2\41\1\0\1\40\47\0"+
    "\2\42\44\0\1\7\1\35\7\0\3\7\1\43\4\7"+
    "\12\0\12\7\6\0\1\7\1\35\7\0\3\7\1\44"+
    "\4\7\12\0\12\7\6\0\1\7\1\35\7\0\10\7"+
    "\12\0\3\7\1\45\6\7\32\0\1\46\1\47\53\0"+
    "\1\50\51\0\1\51\1\0\1\52\50\0\1\53\52\0"+
    "\1\54\52\0\1\55\57\0\1\56\20\0\1\7\1\35"+
    "\7\0\5\7\1\57\2\7\12\0\12\7\6\0\1\7"+
    "\1\35\7\0\5\7\1\60\2\7\12\0\12\7\7\0"+
    "\1\35\45\0\1\36\3\0\3\36\1\37\1\36\1\0"+
    "\1\36\2\0\10\36\6\0\1\36\1\0\1\36\1\0"+
    "\12\36\6\0\1\7\1\35\7\0\10\7\12\0\1\7"+
    "\1\61\10\7\6\0\1\7\1\35\7\0\5\7\1\62"+
    "\2\7\12\0\12\7\6\0\1\7\1\35\7\0\6\7"+
    "\1\63\1\7\12\0\12\7\32\0\1\64\53\0\1\65"+
    "\51\0\1\66\26\0\1\7\1\35\7\0\10\7\12\0"+
    "\1\7\1\67\10\7\6\0\1\7\1\35\7\0\10\7"+
    "\12\0\1\7\1\70\1\7\1\71\6\7\6\0\1\7"+
    "\1\35\7\0\10\7\12\0\5\7\1\72\4\7\6\0"+
    "\1\7\1\35\7\0\1\73\7\7\12\0\12\7\6\0"+
    "\1\7\1\35\7\0\10\7\12\0\4\7\1\74\5\7"+
    "\6\0\1\7\1\35\7\0\10\7\12\0\2\7\1\75"+
    "\7\7\6\0\1\7\1\35\7\0\10\7\12\0\7\7"+
    "\1\76\2\7\6\0\1\7\1\35\7\0\1\77\7\7"+
    "\12\0\12\7\6\0\1\7\1\35\7\0\5\7\1\100"+
    "\2\7\12\0\12\7\6\0\1\7\1\35\7\0\2\7"+
    "\1\101\5\7\12\0\12\7\6\0\1\7\1\35\7\0"+
    "\10\7\12\0\1\7\1\102\10\7\6\0\1\7\1\35"+
    "\7\0\3\7\1\103\4\7\12\0\12\7\6\0\1\7"+
    "\1\35\7\0\4\7\1\104\3\7\12\0\12\7\6\0"+
    "\1\7\1\35\7\0\1\7\1\105\6\7\12\0\12\7"+
    "\6\0\1\7\1\35\7\0\5\7\1\106\2\7\12\0"+
    "\12\7\6\0\1\7\1\35\7\0\10\7\12\0\1\7"+
    "\1\107\10\7\6\0\1\7\1\35\7\0\3\7\1\110"+
    "\4\7\12\0\12\7\6\0\1\7\1\35\7\0\3\7"+
    "\1\111\4\7\12\0\12\7\6\0\1\7\1\35\7\0"+
    "\10\7\12\0\10\7\1\112\1\7\6\0\1\7\1\35"+
    "\7\0\10\7\12\0\5\7\1\113\4\7\6\0\1\7"+
    "\1\35\7\0\5\7\1\114\2\7\12\0\4\7\1\115"+
    "\1\116\1\7\1\117\2\7\6\0\1\7\1\35\7\0"+
    "\2\7\1\120\5\7\12\0\12\7\6\0\1\7\1\35"+
    "\7\0\5\7\1\121\2\7\12\0\12\7\6\0\1\7"+
    "\1\35\7\0\6\7\1\122\1\7\12\0\12\7\6\0"+
    "\1\7\1\35\7\0\3\7\1\123\4\7\12\0\12\7"+
    "\6\0\1\7\1\35\7\0\10\7\12\0\11\7\1\124"+
    "\6\0\1\7\1\35\7\0\1\125\7\7\12\0\12\7"+
    "\6\0\1\7\1\35\7\0\10\7\12\0\7\7\1\126"+
    "\2\7\6\0\1\7\1\35\7\0\4\7\1\127\3\7"+
    "\12\0\12\7\6\0\1\7\1\35\7\0\4\7\1\130"+
    "\3\7\12\0\12\7\6\0\1\7\1\35\7\0\5\7"+
    "\1\131\2\7\12\0\12\7\6\0\1\7\1\35\7\0"+
    "\10\7\12\0\6\7\1\132\3\7\6\0\1\7\1\35"+
    "\7\0\3\7\1\133\4\7\12\0\12\7\6\0\1\7"+
    "\1\35\7\0\5\7\1\134\2\7\12\0\12\7\6\0"+
    "\1\7\1\35\7\0\1\7\1\135\6\7\12\0\12\7"+
    "\6\0\1\7\1\35\7\0\5\7\1\136\2\7\12\0"+
    "\12\7\6\0\1\7\1\35\7\0\4\7\1\137\3\7"+
    "\12\0\12\7\6\0\1\7\1\35\7\0\2\7\1\140"+
    "\5\7\12\0\12\7\6\0\1\7\1\35\7\0\10\7"+
    "\12\0\6\7\1\141\3\7\6\0\1\7\1\35\7\0"+
    "\10\7\12\0\5\7\1\142\4\7\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2967];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\3\11\3\1\1\11\7\1\2\11\11\1\2\11"+
    "\1\1\1\0\1\11\1\0\5\1\1\11\1\0\2\11"+
    "\2\0\3\11\5\1\3\11\54\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[98];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

private void imprimir(String descricao, String lexema) {
    System.out.println(lexema + " - " + descricao);
}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexicalAnalyzer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 354) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public void yylex() throws java.io.IOException {
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { imprimir("Simbolo Fim de Escopo", yytext());
            }
          case 34: break;
          case 2: 
            { throw new RuntimeException("Caractere inválido " + yytext());
            }
          case 35: break;
          case 3: 
            { imprimir("Espaço em branco", yytext());
            }
          case 36: break;
          case 4: 
            { imprimir("Simbolo Fim de Comando (Ponto e Virgula)", yytext());
            }
          case 37: break;
          case 5: 
            { imprimir("Simbolo Abertura de chave", yytext());
            }
          case 38: break;
          case 6: 
            { imprimir("Varialve", yytext());
            }
          case 39: break;
          case 7: 
            { imprimir("Simbolo Divisão", yytext());
            }
          case 40: break;
          case 8: 
            { imprimir("Valor Inteiro", yytext());
            }
          case 41: break;
          case 9: 
            { imprimir("Simbolo Subtração", yytext());
            }
          case 42: break;
          case 10: 
            { imprimir("Simbolo Abre Parênteses", yytext());
            }
          case 43: break;
          case 11: 
            { imprimir("Simbolo Fecha Parênteses", yytext());
            }
          case 44: break;
          case 12: 
            { imprimir("Simbolo Soma", yytext());
            }
          case 45: break;
          case 13: 
            { imprimir("Simbolo Inicio de Escopo", yytext());
            }
          case 46: break;
          case 14: 
            { imprimir("String", yytext());
            }
          case 47: break;
          case 15: 
            { imprimir("Valor Real", yytext());
            }
          case 48: break;
          case 16: 
            { imprimir("Simbolo Menor que", yytext());
            }
          case 49: break;
          case 17: 
            { imprimir("Simbolo Maior que", yytext());
            }
          case 50: break;
          case 18: 
            { imprimir("Simbolo Igual", yytext());
            }
          case 51: break;
          case 19: 
            { imprimir("Simbolo E", yytext());
            }
          case 52: break;
          case 20: 
            { imprimir("Simbolo OU", yytext());
            }
          case 53: break;
          case 21: 
            { imprimir("Simbolo Multiplicação", yytext());
            }
          case 54: break;
          case 22: 
            { imprimir("Simbolo Menor Igual que", yytext());
            }
          case 55: break;
          case 23: 
            { imprimir("Simbolo Difente", yytext());
            }
          case 56: break;
          case 24: 
            { imprimir("Simbolo Maior Igual que", yytext());
            }
          case 57: break;
          case 25: 
            { imprimir("Palavra reservada para saida de dados", yytext());
            }
          case 58: break;
          case 26: 
            { imprimir("Palavra reservada para entrada de dados", yytext());
            }
          case 59: break;
          case 27: 
            { imprimir("Palavra reservada para condicional IF", yytext());
            }
          case 60: break;
          case 28: 
            { imprimir("Palavra reservada para tipos reais", yytext());
            }
          case 61: break;
          case 29: 
            { imprimir("Palavra reservada para tipos inteiros", yytext());
            }
          case 62: break;
          case 30: 
            { imprimir("Palavra reservada para condicionaol ELSE", yytext());
            }
          case 63: break;
          case 31: 
            { imprimir("Palavra reservada para tipos logicos", yytext());
            }
          case 64: break;
          case 32: 
            { imprimir("Palavra reservada para tipos Strings", yytext());
            }
          case 65: break;
          case 33: 
            { imprimir("Palavra reservada para loop WHILE", yytext());
            }
          case 66: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
