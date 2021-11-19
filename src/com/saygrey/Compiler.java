package com.saygrey;

public abstract class Compiler {
    protected Lexem[] lexemTable;
    protected Identifier identifierTable;
    protected SourceCode srcCode;
    protected String objectCode;

    protected abstract void compile();

    protected abstract void lexicalAnalysis();
    protected abstract void syntaxParsing();
    protected abstract void semanticParsing();
    protected abstract void createObjectCode();
    protected abstract void optimizeCode();

    public abstract Lexem[] getLexemTable();
    public abstract Identifier[] getIdentifierTable();
    public abstract DSR getDSR();
    public abstract Triad[] getTriads();
    public abstract OptimizeResults getOptimizeResults();

    public abstract String getObjCodeBeforeOpt();
}

