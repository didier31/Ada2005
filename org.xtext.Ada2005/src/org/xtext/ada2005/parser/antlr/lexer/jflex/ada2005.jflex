package org.xtext.ada2005.parser.antlr.lexer.jflex;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;


%%

%eofval{ 
return Token.EOF;
%eofval}

%integer
%char
%line
%column
%unicode 4.0
%caseless

%extends org.xtext.ada2005.parser.antlr.lexer.InternalAdbLexer

%public
%abstract
%class JFlexInternalAdbLexer

%{
	public JFlexInternalAdbLexer(CharStream input, RecognizerSharedState state) 
	{
	super(input,state);
	}

    public JFlexInternalAdbLexer(CharStream input)
    {
	this(input,new RecognizerSharedState());
    }
    
    public JFlexInternalAdbLexer()
    {
	this(null,new RecognizerSharedState());
	}
	  
   /**
    * @return the zzEOFDone
    */
    public boolean isZzEOFDone() 
    {
	return zzEOFDone;
    }

   /**
    * @param zzEOFDone the zzEOFDone to set
    */
    public void setZzEOFDone(boolean zzEOFDone) 
    {
	this.zzEOFDone = zzEOFDone;
	}	  
	
  /**
   * @return the zzAtBOL
   */
   public boolean isZzAtBOL() 
   {
   return zzAtBOL;
   }

  /**
   * @param zzAtBOL the zzAtBOL to set
   */
   public void setZzAtBOL(boolean zzAtBOL) 
   {
   this.zzAtBOL = zzAtBOL;
   }
	  
	@Override
	public void reset()
	{
	super.reset();
	}

	@Override
	public int getLine() 
	{
	return yyline;
	}

	@Override
	public int getCharIndex()
	{
	return yychar;
	}

	@Override
	public int getCharPositionInLine()
	{
	return yycolumn;
	}
%}

NUMBER_DECIMAL1=[\u0030-\u0039]|[\u0660-\u0669]|[\u06F0-\u06F9]|[\u07C0-\u07C9]|[\u0966-\u096F]
NUMBER_DECIMAL2=[\u09E6-\u09EF]|[\u0A66-\u0A6F]|[\u0AE6-\u0AEF]|[\u0B66-\u0B6F]|[\u0BE6-\u0BEF]|[\u0C66-\u0C6F]
NUMBER_DECIMAL3=[\u0CE6-\u0CEF]|[\u0D66-\u0D6F]|[\u0E50-\u0E59]|[\u0ED0-\u0ED9]|[\u0F20-\u0F29]|[\u1040-\u1049]
NUMBER_DECIMAL4=[\u1090-\u1099]|[\u17E0-\u17E9]|[\u1810-\u1819]|[\u1946-\u194F]|[\u19D0-\u19D9]|[\u1A80-\u1A89]
NUMBER_DECIMAL5=[\u1A90-\u1A99]|[\u1B50-\u1B59]|[\u1BB0-\u1BB9]|[\u1C40-\u1C49]|[\u1C50-\u1C59]|[\uA620-\uA629]
NUMBER_DECIMAL6=[\uA8D0-\uA8D9]|[\uA900-\uA909]|[\uA9D0-\uA9D9]|[\uAA50-\uAA59]|[\uABF0-\uABF9]|[\uFF10-\uFF19]
NUMBER_DECIMAL7=[\u{104A0}-\u{104A9}]|[\u{11066}-\u{1106F}]|[\u{110F0}-\u{110F9}]|[\u{11136}-\u{1113F}]|[\u{111D0}-\u{111D9}]
NUMBER_DECIMAL8=[\u{116C0}-\u{116C9}]|[\u{1D7CE}-\u{1D7FF}]

NUMBER_DECIMAL={NUMBER_DECIMAL1}|{NUMBER_DECIMAL2}|{NUMBER_DECIMAL3}|{NUMBER_DECIMAL4}|{NUMBER_DECIMAL5}|{NUMBER_DECIMAL6}|{NUMBER_DECIMAL7}|{NUMBER_DECIMAL8}


MRKSPCOMB1=\u0903|\u093B|[\u093E-\u0940]|[\u0949-\u094C]|\u094E|\u094F
MRKSPCOMB2=\u0982|\u0983|[\u09BE-\u09C0]|\u09C7|\u09C8|\u09CB|\u09CC|\u09D7|\u0A03
MRKSPCOMB3=[\u0A3E-\u0A40]|\u0A83|[\u0ABE-\u0AC0]|\u0AC9|\u0ACB|\u0ACC|\u0B02|\u0B03
MRKSPCOMB4=\u0B3E|\u0B40|\u0B47|\u0B48|\u0B4B|\u0B4C|\u0B57|\u0BBE|\u0BBF
MRKSPCOMB5=\u0BC1|\u0BC2|[\u0BC6-\u0BC8]|[\u0BCA-\u0BCC]|\u0BD7|[\u0C01-\u0C03]|[\u0C41-\u0C44]
MRKSPCOMB6=\u0C82|\u0C83|\u0CBE|[\u0CC0-\u0CC4]|\u0CC7|\u0CC8|\u0CCA|\u0CCB|\u0CD5|\u0CD6
MRKSPCOMB7=\u0D02|\u0D03|[\u0D3E-\u0D40]|[\u0D46-\u0D48]|[\u0D4A-\u0D4C]|\u0D57|\u0D82|\u0D83
MRKSPCOMB8=[\u0DCF-\u0DD1]|[\u0DD8-\u0DDF]|\u0DF2|\u0DF3|\u0F3E|\u0F3F|\u0F7F|\u102B|\u102C
MRKSPCOMB9=\u1031|\u1038|\u103B|\u103C|\u1056|\u1057|[\u1062-\u1064]|[\u1067-\u106D]
MRKSPCOMB10=\u1083|\u1084|[\u1087-\u108C]|\u108F|[\u109A-\u109C]|\u17B6|[\u17BE-\u17C5]
MRKSPCOMBA={MRKSPCOMB1}|{MRKSPCOMB2}|{MRKSPCOMB3}|{MRKSPCOMB4}|{MRKSPCOMB5}|{MRKSPCOMB6}|{MRKSPCOMB7}|{MRKSPCOMB8}|{MRKSPCOMB9}|{MRKSPCOMB10}
MRKSPCOMB11=\u17C7|\u17C8|[\u1923-\u1926]|[\u1929-\u192B]|\u1930|\u1931|[\u1933-\u1938]|[\u19B0-\u19C0]
MRKSPCOMB12=\u19C8|\u19C9|[\u1A19-\u1A1B]|\u1A55|\u1A57|\u1A61|\u1A63|\u1A64
MRKSPCOMB13=[\u1A6D-\u1A72]|\u1B04|\u1B35|\u1B3B|[\u1B3D-\u1B41]|\u1B43|\u1B44
MRKSPCOMB14=\u1B82|\u1BA1|\u1BA6|\u1BA7|\u1BAA|\u1BAC|\u1BAD|\u1BE7
MRKSPCOMB15=[\u1BEA-\u1BEC]|\u1BEE|\u1BF2|\u1BF3|[\u1C24-\u1C2B]|\u1C34|\u1C35|\u1CE1
MRKSPCOMB16=\u1CF2|\u1CF3|\u302E|\u302F|\uA823|\uA824|\uA827|\uA880|\uA881|[\uA8B4-\uA8C3]
MRKSPCOMB17=\uA952|\uA953|\uA983|\uA9B4|\uA9B5|\uA9BA|\uA9BB|[\uA9BD-\uA9C0]|\uAA2F|\uAA30
MRKSPCOMB18=\uAA33|\uAA34|\uAA4D|\uAA7B|\uAAEB|\uAAEE|\uAAEF|\uAAF5
MRKSPCOMB19=\uABE3|\uABE4|\uABE6|\uABE7|\uABE9|\uABEA|\uABEC|\u{11000}|\u{11002} 
MRKSPCOMB20=\u{11082}|[\u{110B0}-\u{110B2}]|\u{110B7}|\u{110B8}|\u{1112C}|\u{11182}|[\u{111B3}-\u{111B5}]
MRKSPCOMBB= {MRKSPCOMB11}|{MRKSPCOMB12}|{MRKSPCOMB13}|{MRKSPCOMB14}|{MRKSPCOMB15}|{MRKSPCOMB16}|{MRKSPCOMB17}|{MRKSPCOMB18}|{MRKSPCOMB19}{MRKSPCOMB20}
MRKSPCOMB21=\u{111BF}|\u{111C0}|\u{116AC}|\u{116AE}|\u{116AF}|\u{116B6}|[\u{16F51}-\u{16F7E}]|\u{1D165}|\u{1D166} 
MRKSPCOMB22=[\u{1D16D}-\u{1D172}]
 
MARKSPACING_COMBINING={MRKSPCOMBA}|{MRKSPCOMBB}|{MRKSPCOMB21}|{MRKSPCOMB22}


OTHER_FORMAT=\u00AD|[\u0600-\u0604]|\u06DD|\u070F|[\u200B-\u200F]|[\u202A-\u202E]|[\u2060-\u2064]|[\u206A-\u206F]|\uFEFF|[\uFFF9-\uFFFB]|\u{110BD}|[\u{1D173}-\u{1D17A}]|\u{E0001}|[\u{E0020}-\u{E007F}]


MS1=\u05BF|\u05C1|\u05C2|\u05C4|\u05C5|\u05C7
MS2=[\u0610-\u061A]|[\u064B-\u065F]|\u0670
MS3=[\u06D6-\u06DC]|[\u06DF-\u06E4]|\u06E7
MS4=\u06E8|[\u06EA-\u06ED]|\u0711|[\u0730-\u074A]
MS5=[\u07A6-\u07B0]|[\u07EB-\u07F3]|[\u0816-\u0819]
MS6=[\u081B-\u0823]|[\u0825-\u0827]|[\u0829-\u082D]
MS7=[\u0859-\u085B]|[\u08E4-\u08FE]|[\u0900-\u0902]
MS8=\u093A|\u093C|[\u0941-\u0948]|\u094D
MS9=[\u0951-\u0957]|\u0962|\u0963|\u0981
MSA={MS1}|{MS2}|{MS3}|{MS4}|{MS5}|{MS6}|{MS7}|{MS8}|{MS9}
MS10=\u09BC|[\u09C1-\u09C4]|\u09CD|\u09E2|\u09E3
MS11=\u0A01|\u0A02|\u0A3C|\u0A41|\u0A42|\u0A47
MS12=\u0A48|[\u0A4B-\u0A4D]|\u0A51|\u0A70|\u0A71
MS13=\u0A75|\u0A81|\u0A82|\u0ABC|[\u0AC1-\u0AC5]
MS14=\u0AC7|\u0AC8|\u0ACD|\u0AE2|\u0AE3|\u0B01
MS15=\u0B3C|\u0B3F|[\u0B41-\u0B44]|\u0B4D|\u0B56
MS16=\u0B62|\u0B63|\u0B82|\u0BC0|\u0BCD|[\u0C3E-\u0C40]
MS17=[\u0C46-\u0C48]|[\u0C4A-\u0C4D]|\u0C55|\u0C56|\u0C62
MS18=\u0C63|\u0CBC|\u0CBF|\u0CC6|\u0CCC|\u0CCD|\u0CE2
MS19=\u0CE3|[\u0D41-\u0D44]|\u0D4D|\u0D62|\u0D63|\u0DCA
MSB={MS10}|{MS11}|{MS12}|{MS13}|{MS14}|{MS15}|{MS16}|{MS17}|{MS18}|{MS19}
MS20=[\u0DD2-\u0DD4]|\u0DD6|\u0E31|[\u0E34-\u0E3A]
MS21=[\u0E47-\u0E4E]|\u0EB1|[\u0EB4-\u0EB9]|\u0EBB
MS22=\u0EBC|[\u0EC8-\u0ECD]|\u0F18|\u0F19|\u0F35
MS23=\u0F37|\u0F39|[\u0F71-\u0F7E]|[\u0F80-\u0F84]
MS24=\u0F86|\u0F87|[\u0F8D-\u0F97]|[\u0F99-\u0FBC]
MS25=\u0FC6|[\u102D-\u1030]|[\u1032-\u1037]|\u1039
MS26=\u103A|\u103D|\u103E|\u1058|\u1059|[\u105E-\u1060]
MS27=[\u1071-\u1074]|\u1082|\u1085|\u1086|\u108D
MS28=\u109D|[\u135D-\u135F]|[\u1712-\u1714]|[\u1732-\u1734]
MS29=\u1752|\u1753|\u1772|\u1773|\u17B4|\u17B5|[\u17B7-\u17BD]
MSC={MS20}|{MS21}|{MS22}|{MS23}|{MS24}|{MS25}|{MS26}|{MS27}|{MS28}|{MS29}
MS30=\u17C6|[\u17C9-\u17D3]|\u17DD|[\u180B-\u180D]|\u18A9
MS31=[\u1920-\u1922]|\u1927|\u1928|\u1932|[\u1939-\u193B]
MS32=\u1A17|\u1A18|\u1A56|[\u1A58-\u1A5E]|\u1A60|\u1A62
MS33=[\u1A65-\u1A6C]|[\u1A73-\u1A7C]|\u1A7F|[\u1B00-\u1B03]
MS34=\u1B34|[\u1B36-\u1B3A]|\u1B3C|\u1B42|[\u1B6B-\u1B73]
MS35=\u1B80|\u1B81|[\u1BA2-\u1BA5]|\u1BA8|\u1BA9|\u1BAB
MS36=\u1BE6|\u1BE8|\u1BE9|\u1BED|[\u1BEF-\u1BF1]|[\u1C2C-\u1C33]
MS37=\u1C36|\u1C37|[\u1CD0-\u1CD2]|[\u1CD4-\u1CE0]|[\u1CE2-\u1CE8]
MS38=\u1CED|\u1CF4|[\u1DC0-\u1DE6]|[\u1DFC-\u1DFF]|[\u20D0-\u20DC]
MS39=\u20E1|[\u20E5-\u20F0]|[\u2CEF-\u2CF1]|\u2D7F|[\u2DE0-\u2DFF]
MSD={MS30}|{MS31}|{MS32}|{MS33}|{MS34}|{MS35}|{MS36}|{MS37}|{MS38}|{MS39}
MS40=[\u302A-\u302D]|\u3099|\u309A|\uA66F|[\uA674-\uA67D]
MS41=\uA69F|\uA6F0|\uA6F1|\uA802|\uA806|\uA80B|\uA825
MS42=\uA826|\uA8C4|[\uA8E0-\uA8F1]|[\uA926-\uA92D]|[\uA947-\uA951]
MS43=[\uA980-\uA982]|\uA9B3|[\uA9B6-\uA9B9]|\uA9BC|[\uAA29-\uAA2E]
MS44=\uAA31|\uAA32|\uAA35|\uAA36|\uAA43|\uAA4C|\uAAB0
MS45=[\uAAB2-\uAAB4]|\uAAB7|\uAAB8|\uAABE|\uAABF|\uAAC1
MS46=\uAAEC|\uAAED|\uAAF6|\uABE5|\uABE8|\uABED|\uFB1E
MS47=[\uFE00-\uFE0F]|[\uFE20-\uFE26]|\u{101FD}|[\u{10A01}-\u{10A03}]
MS48=\u{10A05}|\u{10A06}|[\u{10A0C}-\u{10A0F}]|[\u{10A38}-\u{10A3A}]|\u{10A3F}
MS49=\u{11001}|[\u{11038}-\u{11046}]|\u{11080}|\u{11081}|[\u{110B3}-\u{110B6}]
MSE={MS40}|{MS41}|{MS42}|{MS43}|{MS44}|{MS45}|{MS46}|{MS47}|{MS48}|{MS49}
MS50=\u{110B9}|\u{110BA}|[\u{11100}-\u{11102}]|[\u{11127}-\u{1112B}]|[\u{1112D}-\u{11134}]
MS51=\u{11180}|\u{11181}|[\u{111B6}-\u{111BE}]|\u{116AB}|\u{116AD}|[\u{116B0}-\u{116B5}]
MS52=\u{116B7}|[\u{16F8F}-\u{16F92}]|[\u{1D167}-\u{1D169}]|[\u{1D17B}-\u{1D182}]
MS53=[\u{1D185}-\u{1D18B}]|[\u{1D1AA}-\u{1D1AD}]|[\u{1D242}-\u{1D244}]|[\u{E0100}-\u{E01EF}]
MS54=[\u0300-\u036F]|[\u0483-\u0487]|[\u0591-\u05BD]    
MSF={MS50}|{MS51}|{MS52}|{MS53}|{MS54}
MARKNON_SPACING={MSA}|{MSB}|{MSC}|{MSD}|{MSE}|{MSF} 

PUNCTUATION_CONNECTOR=\u005F|\u203F|\u2040|\u2054|\uFE33|\uFE34|[\uFE4D-\uFE4F]|\uFF3F

DIGIT=0|1|2|3|4|5|6|7|8|9

NUMERAL={DIGIT}(_?{DIGIT})*

EXPONENT=(E|e)(-|\+?){NUMERAL}

BASE={NUMERAL}

BASED_LITERAL={BASE}#{BASED_NUMERAL}(\.{BASED_NUMERAL})?#{EXPONENT}?

EXTENDED_DIGIT={DIGIT}|A|B|C|D|E|F

BASED_NUMERAL={EXTENDED_DIGIT}(_?{EXTENDED_DIGIT})*

DECIMAL_LITERAL={NUMERAL}(\.{NUMERAL})?{EXPONENT}?

NODOUBLEQUOTE_MARKGRAPHIC_CHARACTER=[\u0020-\!]|[\#-\u1FFF]|\u{0FFFF}|\u{10FFF}F
NOQUOTE_MARKGRAPHIC_CHARACTER=[\u0020-&]|[\(-\u1FFF]|\u{0FFFF}|\u{10FFF}F
NON_NOQUOTE_MARKGRAPHIC_CHARACTER=[^\u0020-&]&&[^\(-\u1FFF] 

STRING_ELEMENT={NODOUBLEQUOTE_MARKGRAPHIC_CHARACTER}|\"\"

GRAPHIC_CHARACTER=[\u0020-\u1FFF]|\u{0FFFF}|\u{10FFF}F 

NONEND_OFLINE_CHARACTER={GRAPHIC_CHARACTER}|\t

LETTER_UPPERCASE=[A-Z]

LETTER_LOWERCASE=[a-z]

LETTER_TITLECASE=\u01C5|\u01C8|\u01CB|\u01F2|[\u1F88-\u1F8F]|[\u1F98-\u1F9F]|[\u1FA8-\u1FAF]|\u1FBC|\u1FCC|\u1FFC  


LM0=[\u02B0-\u02C1]|[\u02C6-\u02D1]|[\u02E0-\u02E4]
LM1=\u02EC|\u02EE|\u0374|\u037A|\u0559|\u0640
LM2=\u06E5|\u06E6|\u07F4|\u07F5|\u07FA|\u081A
LM3=\u0824|\u0828|\u0971|\u0E46|\u0EC6|\u10FC
LM4=\u17D7|\u1843|\u1AA7|[\u1C78-\u1C7D]
LM5=[\u1D2C-\u1D6A]|\u1D78|[\u1D9B-\u1DBF]|\u2071
LM6=\u207F|[\u2090-\u209C]|\u2C7C|\u2C7D|\u2D6F
LM7=\u2E2F|\u3005|[\u3031-\u3035]|\u303B|\u309D
LM8=\u309E|[\u30FC-\u30FE]|\uA015|[\uA4F8-\uA4FD]
LM9=\uA60C|\uA67F|[\uA717-\uA71F]|\uA770|\uA788
LM10=\uA7F8|\uA7F9|\uA9CF|\uAA70|\uAADD|\uAAF3
LM11=\uAAF4|\uFF70|\uFF9E|\uFF9F|[\u{16F93}-\u{16F9F}] 

LETTER_MODIFIER={LM0}|{LM1}|{LM2}|{LM3}|{LM4}|{LM5}|{LM6}|{LM7}|{LM8}|{LM9}|{LM10}|{LM11}    

LO00=\u00AA|\u00BA|\u01BB|\u01C0|\u01C3|\u0294
LO0=\u05D0|\u05EA|\u05F0|\u05F2|\u0620|\u063F|\u0641|\u064A|\u066E|\u066F|\u0671|\u06D3
LO1=\u06D5|\u06EE|\u06EF|\u06FA|\u06FC|\u06FF|\u0710|\u0712|\u072F
LO2=\u074D|\u07A5|\u07B1|\u07CA|\u07EA|\u0800|\u0815|\u0840|\u0858|\u08A0
LO3=\u08A2|\u08AC|\u0904|\u0939|\u093D|\u0950|\u0958|\u0961|\u0972|\u0977
LO4=\u0979|\u097F|\u0985|\u098C|\u098F|\u0990|\u0993|\u09A8|\u09AA|\u09B0|\u09B2
LO5=\u09B6|\u09B9|\u09BD|\u09CE|\u09DC|\u09DD|\u09DF|\u09E1|\u09F0|\u09F1
LO6=\u0A05|\u0A0A|\u0A0F|\u0A10|\u0A13|\u0A28|\u0A2A|\u0A30|\u0A32|\u0A33|\u0A35|\u0A36
LO7=\u0A38|\u0A39|\u0A59|\u0A5C|\u0A5E|\u0A72|\u0A74|\u0A85|\u0A8D|\u0A8F|\u0A91
LO8=\u0A93|\u0AA8|\u0AAA|\u0AB0|\u0AB2|\u0AB3|\u0AB5|\u0AB9|\u0ABD|\u0AD0
LO9=\u0AE0|\u0AE1|\u0B05|\u0B0C|\u0B0F|\u0B10|\u0B13|\u0B28|\u0B2A|\u0B30|\u0B32|\u0B33
LOA={LO00}|{LO0}|{LO1}|{LO2}|{LO3}|{LO4}|{LO5}|{LO6}|{LO7}|{LO8}|{LO9}
LO10=\u0B35|\u0B39|\u0B3D|\u0B5C|\u0B5D|\u0B5F|\u0B61|\u0B71|\u0B83
LO11=\u0B85|\u0B8A|\u0B8E|\u0B90|\u0B92|\u0B95|\u0B99|\u0B9A|\u0B9C|\u0B9E|\u0B9F
LO12=\u0BA3|\u0BA4|\u0BA8|\u0BAA|\u0BAE|\u0BB9|\u0BD0|\u0C05|\u0C0C|\u0C0E|\u0C10
LO13=\u0C12|\u0C28|\u0C2A|\u0C33|\u0C35|\u0C39|\u0C3D|\u0C58|\u0C59|\u0C60|\u0C61
LO14=\u0C85|\u0C8C|\u0C8E|\u0C90|\u0C92|\u0CA8|\u0CAA|\u0CB3|\u0CB5|\u0CB9|\u0CBD
LO15=\u0CDE|\u0CE0|\u0CE1|\u0CF1|\u0CF2|\u0D05|\u0D0C|\u0D0E|\u0D10|\u0D12|\u0D3A
LO16=\u0D3D|\u0D4E|\u0D60|\u0D61|\u0D7A|\u0D7F|\u0D85|\u0D96|\u0D9A|\u0DB1
LO17=\u0DB3|\u0DBB|\u0DBD|\u0DC0|\u0DC6|\u0E01|\u0E30|\u0E32|\u0E33|\u0E40|\u0E45
LO18=\u0E81|\u0E82|\u0E84|\u0E87|\u0E88|\u0E8A|\u0E8D|\u0E94|\u0E97
LO19=\u0E99|\u0E9F|\u0EA1|\u0EA3|\u0EA5|\u0EA7|\u0EAA|\u0EAB|\u0EAD|\u0EB0
LOB={LO10}|{LO11}|{LO12}|{LO13}|{LO14}|{LO15}|{LO16}|{LO17}|{LO18}|{LO19}
LO20=\u0EB2|\u0EB3|\u0EBD|\u0EC0|\u0EC4|\u0EDC|\u0EDF|\u0F00|\u0F40|\u0F47
LO21=\u0F49|\u0F6C|\u0F88|\u0F8C|\u1000|\u102A|\u103F|\u1050|\u1055|\u105A|\u105D
LO22=\u1061|\u1065|\u1066|\u106E|\u1070|\u1075|\u1081|\u108E|\u10D0|\u10FA
LO23=\u10FD|\u1248|\u124A|\u124D|\u1250|\u1256|\u1258|\u125A|\u125D|\u1260|\u1288
LO24=\u128A|\u128D|\u1290|\u12B0|\u12B2|\u12B5|\u12B8|\u12BE|\u12C0|\u12C2|\u12C5
LO25=\u12C8|\u12D6|\u12D8|\u1310|\u1312|\u1315|\u1318|\u135A|\u1380|\u138F|\u13A0|\u13F4
LO26=\u1401|\u166C|\u166F|\u167F|\u1681|\u169A|\u16A0|\u16EA|\u1700|\u170C|\u170E|\u1711
LO27=\u1720|\u1731|\u1740|\u1751|\u1760|\u176C|\u176E|\u1770|\u1780|\u17B3|\u17DC
LO28=\u1820|\u1842|\u1844|\u1877|\u1880|\u18A8|\u18AA|\u18B0|\u18F5|\u1900|\u191C
LO29=\u1950|\u196D|\u1970|\u1974|\u1980|\u19AB|\u19C1|\u19C7|\u1A00|\u1A16|\u1A20|\u1A54
LOC={LO20}|{LO21}|{LO22}|{LO23}|{LO24}|{LO25}|{LO26}|{LO27}|{LO28}|{LO29}
LO30=\u1B05|\u1B33|\u1B45|\u1B4B|\u1B83|\u1BA0|\u1BAE|\u1BAF|\u1BBA|\u1BE5|\u1C00|\u1C23
LO31=\u1C4D|\u1C4F|\u1C5A|\u1C77|\u1CE9|\u1CEC|\u1CEE|\u1CF1|\u1CF5|\u1CF6|\u2135|\u2138
LO32=\u2D30|\u2D67|\u2D80|\u2D96|\u2DA0|\u2DA6|\u2DA8|\u2DAE|\u2DB0|\u2DB6|\u2DB8|\u2DBE
LO33=\u2DC0|\u2DC6|\u2DC8|\u2DCE|\u2DD0|\u2DD6|\u2DD8|\u2DDE|\u3006|\u303C
LO34=\u3041|\u3096|\u309F|\u30A1|\u30FA|\u30FF|\u3105|\u312D|\u3131|\u318E
LO35=\u31A0|\u31BA|\u31F0|\u31FF|\u3400|\u4DB5|\u4E00|\u9FCC
LO36=\uA000|\uA014|\uA016|\uA48C|\uA4D0|\uA4F7|\uA500|\uA60B|\uA610|\uA61F|\uA62A|\uA62B
LO37=\uA66E|\uA6A0|\uA6E5|\uA7FB|\uA801|\uA803|\uA805|\uA807|\uA80A|\uA80C|\uA822
LO38=\uA840|\uA873|\uA882|\uA8B3|\uA8F2|\uA8F7|\uA8FB|\uA90A|\uA925|\uA930|\uA946
LO39=\uA960|\uA97C|\uA984|\uA9B2|\uAA00|\uAA28|\uAA40|\uAA42|\uAA44|\uAA4B|\uAA60|\uAA6F
LOD={LO30}|{LO31}|{LO32}|{LO33}|{LO34}|{LO35}|{LO36}|{LO37}|{LO38}|{LO39}
LO40=\uAA71|\uAA76|\uAA7A|\uAA80|\uAAAF|\uAAB1|\uAAB5|\uAAB6|\uAAB9|\uAABD
LO41=\uAAC0|\uAAC2|\uAADB|\uAADC|\uAAE0|\uAAEA|\uAAF2|\uAB01|\uAB06
LO42=\uAB09|\uAB0E|\uAB11|\uAB16|\uAB20|\uAB26|\uAB28|\uAB2E|\uABC0|\uABE2|\uAC00
LO43=\uD7A3|\uD7B0|\uD7C6|\uD7CB|\uD7FB|\uF900|\uFA6D|\uFA70|\uFAD9|\uFB1D
LO44=\uFB1F|\uFB28|\uFB2A|\uFB36|\uFB38|\uFB3C|\uFB3E|\uFB40|\uFB41|\uFB43|\uFB44
LO45=\uFB46|\uFBB1|\uFBD3|\uFD3D|\uFD50|\uFD8F|\uFD92|\uFDC7|\uFDF0|\uFDFB|\uFE70|\uFE74
LO46=\uFE76|\uFEFC|\uFF66|\uFF6F|\uFF71|\uFF9D|\uFFA0|\uFFBE|\uFFC2|\uFFC7|\uFFCA|\uFFCF
LO47=\uFFD2|\uFFD7|\uFFDA|\uFFDC|\u{10000}|\u{1000B}|\u{1000D}|\u{10026}|\u{10028}|\u{1003A}|\u{1003C}|\u{1003D}
LO48=\u{1003F}|\u{1004D}|\u{10050}|\u{1005D}|\u{10080}|\u{100FA}|\u{10280}|\u{1029C}|\u{102A0}|\u{102D0}|\u{10300}|\u{1031E}
LO49=\u{10330}|\u{10340}|\u{10342}|\u{10349}|\u{10380}|\u{1039D}|\u{103A0}|\u{103C3}|\u{103C8}|\u{103CF}|\u{10450}|\u{1049D}
LOE={LO40}|{LO41}|{LO42}|{LO43}|{LO44}|{LO45}|{LO46}|{LO47}|{LO48}|{LO49}
LO50=\u{10800}|\u{10805}|\u{10808}|\u{1080A}|\u{10835}|\u{10837}|\u{10838}|\u{1083C}|\u{1083F}|\u{10855}
LO51=\u{10900}|\u{10915}|\u{10920}|\u{10939}|\u{10980}|\u{109B7}|\u{109BE}|\u{109BF}|\u{10A00}|\u{10A10}|\u{10A13}
LO52=\u{10A15}|\u{10A17}|\u{10A19}|\u{10A33}|\u{10A60}|\u{10A7C}|\u{10B00}|\u{10B35}|\u{10B40}|\u{10B55}|\u{10B60}|\u{10B72}
LO53=\u{10C00}|\u{10C48}|\u{11003}|\u{11037}|\u{11083}|\u{110AF}|\u{110D0}|\u{110E8}|\u{11103}|\u{11126}|\u{11183}|\u{111B2}
LO54=\u{111C1}|\u{111C4}|\u{11680}|\u{116AA}|\u{12000}|\u{1236E}|\u{13000}|\u{1342E}|\u{16800}|\u{16A38}|\u{16F00}|\u{16F44}
LO55=\u{16F50}|\u{1B000}|\u{1B001}|\u{1EE00}|\u{1EE03}|\u{1EE05}|\u{1EE1F}|\u{1EE21}|\u{1EE22}|\u{1EE24}
LO56=\u{1EE27}|\u{1EE29}|\u{1EE32}|\u{1EE34}|\u{1EE37}|\u{1EE39}|\u{1EE3B}|\u{1EE42}
LO57=\u{1EE47}|\u{1EE49}|\u{1EE4B}|\u{1EE4D}|\u{1EE4F}|\u{1EE51}|\u{1EE52}|\u{1EE54}
LO58=\u{1EE57}|\u{1EE59}|\u{1EE5B}|\u{1EE5D}|\u{1EE5F}|\u{1EE61}|\u{1EE62}
LO59=\u{1EE64}|\u{1EE67}|\u{1EE6A}|\u{1EE6C}|\u{1EE72}|\u{1EE74}|\u{1EE77}|\u{1EE79}|\u{1EE7C}|\u{1EE7E}
LOF={LO50}|{LO51}|{LO52}|{LO53}|{LO54}|{LO55}|{LO56}|{LO57}|{LO58}|{LO59}
LO60=\u{1EE80}|\u{1EE89}|\u{1EE8B}|\u{1EE9B}|\u{1EEA1}|\u{1EEA3}|\u{1EEA5}|\u{1EEA9}|\u{1EEAB}|\u{1EEBB}|\u{20000}
LO61=\u{2A6D6}|\u{2A700}|\u{2B734}|\u{2B740}|\u{2B81D}|\u{2F800}|\u{2FA1D}
LOG={LO60}|{LO61}
LETTER_OTHER={LOA}|{LOB}|{LOC}|{LOD}|{LOE}|{LOF}|{LOG}


NUMBER_LETTER=[\u16EE-\u16F0]|[\u2160-\u2182]|[\u2185-\u2188]|\u3007|[\u3021-\u3029]|[\u3038-\u303A]|[\uA6E6-\uA6EF]|[\u{10140}-\u{10174}]|\u{10341}|\u{1034A}|[\u{103D1}-\u{103D5}]|[\u{12400}-\u{12462}]

IDENTIFIER_EXTEND={MARKNON_SPACING}|{MARKSPACING_COMBINING}|{NUMBER_DECIMAL}|{PUNCTUATION_CONNECTOR}|{OTHER_FORMAT}

IDENTIFIER_START={LETTER_UPPERCASE}|{LETTER_LOWERCASE}|{LETTER_TITLECASE}|{LETTER_MODIFIER}|{NUMBER_LETTER}|{LETTER_OTHER}


OPERATOR_SYMBOL=(and|or|xor|=|"/="|<|<=|>|>=|-|"+"|&|"**"|"*"|"/"|mod|rem|abs|not)

%%

abort                                                          { return RULE_ABORT_; }
abs                                                            { return RULE_ABS_; } 
abstract                                                       { return RULE_ABSTRACT_; }
accept                                                         { return RULE_ACCEPT_; }
access                                                         { return RULE_ACCESS_; }
aliased                                                        { return RULE_ALIASED_; }
all                                                            { return RULE_ALL_; }
and                                                            { return RULE_AND_; }
array                                                          { return RULE_ARRAY_; } 
at                                                             { return RULE_AT_; }
begin                                                          { return RULE_BEGIN_; }
body                                                           { return RULE_BODY_; }
case                                                           { return RULE_CASE_; } 
constant                                                       { return RULE_CONSTANT_; } 
declare                                                        { return RULE_DECLARE_; } 
delay                                                          { return RULE_DELAY_; } 
delta                                                          { return RULE_DELTA_; } 
digits                                                         { return RULE_DIGITS_; }
do                                                             { return RULE_DO_; } 
else                                                           { return RULE_ELSE_; } 
elsif                                                          { return RULE_ELSIF_; }
end                                                            { return RULE_END_; } 
entry                                                          { return RULE_ENTRY_; }
exception                                                      { return RULE_EXCEPTION_; } 
exit                                                           { return RULE_EXIT_; } 
for                                                            { return RULE_FOR_; }
function                                                       { return RULE_FUNCTION_; } 
generic                                                        { return RULE_GENERIC_; } 
goto                                                           { return RULE_GOTO_; } 
if                                                             { return RULE_IF_; } 
in                                                             { return RULE_IN_; }
interface                                                      { return RULE_INTERFACE_; } 
is                                                             { return RULE_IS_; } 
limited                                                        { return RULE_LIMITED_; } 
loop                                                           { return RULE_LOOP_; } 
mod                                                            { return RULE_MOD_; } 
new                                                            { return RULE_NEW_; } 
not                                                            { return RULE_NOT_; } 
null                                                           { return RULE_NULL_; } 
of                                                             { return RULE_OF_; } 
or                                                             { return RULE_OR_; } 
others                                                         { return RULE_OTHERS_; } 
out                                                            { return RULE_OUT_; } 
overriding                                                     { return RULE_OVERRIDING_; } 
package                                                        { return RULE_PACKAGE_; } 
pragma                                                         { return RULE_PRAGMA_; } 
private                                                        { return RULE_PRIVATE_; }
procedure                                                      { return RULE_PROCEDURE_; }
protected                                                      { return RULE_PROTECTED_; }
raise                                                          { return RULE_RAISE_; }
range                                                          { return RULE_RANGE_; }
record                                                         { return RULE_RECORD_; }
rem                                                            { return RULE_REM_; }
renames                                                        { return RULE_RENAMES_; }
requeue                                                        { return RULE_REQUEUE_; }
return                                                         { return RULE_RETURN_; }
reverse                                                        { return RULE_REVERSE_; }
select                                                         { return RULE_SELECT_; }
separate                                                       { return RULE_SEPARATE_; }
subtype                                                        { return RULE_SUBTYPE_; }
synchronized                                                   { return RULE_SYNCHRONIZED_; }
tagged                                                         { return RULE_TAGGED_; }
task                                                           { return RULE_TASK_; }
terminate                                                      { return RULE_TERMINATE_; }
then                                                           { return RULE_THEN_; }
type                                                           { return RULE_TYPE_; }
until                                                          { return RULE_UNTIL_; }
use                                                            { return RULE_USE_; }
when                                                           { return RULE_WHEN_; }
while                                                          { return RULE_WHILE_; }
with                                                           { return RULE_WITH_; }
xor                                                            { return RULE_XOR_; } 

";"                                                            { return RULE_PV; }
":"                                                            { return RULE_DP; }
"."                                                            { return RULE_P; }
","                                                            { return RULE_V; }
"("                                                            { return RULE_PG; }
")"                                                            { return RULE_PD; }
"&"                                                            { return RULE_ET_COM; }
"+"                                                            { return RULE_PLUS; }
"-"                                                            { return RULE_MOINS; }
"*"                                                            { return RULE_ETOI; }
"**"                                                           { return RULE_ETOI2; }
"/"                                                            { return RULE_SLASH; }
"'"                                                            { return RULE_QUOTE; }
"=>"                                                           { return RULE_FLECHE; }
"|"|"!"                                                        { return RULE_BV; }
":="                                                           { return RULE_DPE; }
".."                                                           { return RULE_PP; }
"<>"                                                           { return RULE_BOIT; }
"="                                                            { return RULE_EG; }
"/="                                                           { return RULE_DIFF; }
"<"                                                            { return RULE_INF; }
"<="                                                           { return RULE_INFE; }
">"                                                            { return RULE_SUP; }
">="                                                           { return RULE_SUPE; }
"<<"                                                           { return RULE_CHG; }
">>"                                                           { return RULE_CHD; }

{DECIMAL_LITERAL} | {BASED_LITERAL}                            { return RULE_NUMERIC_LITERAL; }
 
(\u0020|\t|\013|\r|\n|\f)+                                     { return RULE_WS; }

{IDENTIFIER_START}({IDENTIFIER_START}|{IDENTIFIER_EXTEND})*    { return RULE_IDENTIFIER; }
    
\'{NOQUOTE_MARKGRAPHIC_CHARACTER}\' $                          { return RULE_CHARACTER_LITERAL; }

\'{NOQUOTE_MARKGRAPHIC_CHARACTER}\' / {NOQUOTE_MARKGRAPHIC_CHARACTER} $  
                                                               { return RULE_CHARACTER_LITERAL; }

\'{NOQUOTE_MARKGRAPHIC_CHARACTER}\' / {NON_NOQUOTE_MARKGRAPHIC_CHARACTER} | {NOQUOTE_MARKGRAPHIC_CHARACTER} [^\']
                                                               { return RULE_CHARACTER_LITERAL; }

-- {NONEND_OFLINE_CHARACTER}*                                  { return RULE_SL_COMMENT; }

\"{OPERATOR_SYMBOL}\"                                          { return RULE_OPERATOR_SYMBOL; }

\"{STRING_ELEMENT}*\"                                          { return RULE_STRING_LITERAL; }

.                                                              { return yytext().charAt(0); }
