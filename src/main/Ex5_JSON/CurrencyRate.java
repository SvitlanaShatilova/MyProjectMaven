package main.Ex5_JSON;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.Instant;

public class CurrencyRate {
    @JsonProperty("currencyCodeA")
    private String from;
    @JsonProperty("currencyCodeB")
    private String to;
    @JsonProperty("date")
    private long time;
    @JsonProperty("rateSell")
    private BigDecimal sale;
    @JsonProperty("rateBuy")
    private BigDecimal buy;
    @JsonProperty("rateCross")
    private BigDecimal cross;



    public CurrencyRate() {
    }

    public CurrencyRate(String from, String to, long time, BigDecimal sale, BigDecimal buy, BigDecimal cross) {
        this.from = from;
        this.to = to;
        this.time = time;
        this.sale = sale;
        this.buy = buy;
        this.cross = cross;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public void setBuy(BigDecimal buy) {
        this.buy = buy;
    }

    public BigDecimal getCross() {
        return cross;
    }

    public void setCross(BigDecimal cross) {
        this.cross = cross;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "currencyCodeA ='" + from + '\'' +
                ", currencyCodeB ='" + to + '\'' +
                ", date = " + (Instant.ofEpochSecond(time)) +
                ", buy = " + buy +
                ", cross = " + cross +
                ", sale = " + sale +
                '}';
    }
}
