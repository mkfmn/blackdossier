package com.packetnode.blackdossier.quote;

import java.util.List;
import java.util.Date;

public interface QuoteFactory 
{
	final static String[] DJIA = new String[] {"AA", "AXP", "T", "BAC", "BA", "CAT", 
										 "CVX", "KO", "CSCO", "DIS", "DD", "XOM", 
										 "GE", "HPQ", "HD", "IBM", "INTC", "JNJ", 
										 "JPM", "KFT", "MCD", "MRK", "MSFT", "PFE", 
										 "PG", "TRV", "UTX", "VZ", "WMT"};

	public List<String> getAllTickers() throws QuoteFactoryException;
	public List<String> getTickers(String regex) throws QuoteFactoryException;
	public Quote getQuote(String ticker) throws QuoteFactoryException;
	public Quote getQuote(String ticker, Date date) throws QuoteFactoryException;
	public List<Quote> getQuotes(String ticker, Date startDate, Date stopDate) throws QuoteFactoryException;
	public List<Quote> getQuotes(String[] tickers) throws QuoteFactoryException;
	public List<Quote> getAllQuotes(String ticker) throws QuoteFactoryException;
	public void finished();
}