/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoD;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class BlocoD {

    private RegistroD001 registroD001;
    private RegistroD990 registroD990;
    private List<RegistroD100> registroD100;
    private List<RegistroD300> registroD300;
    private List<RegistroD350> registroD350;
    private List<RegistroD400> registroD400;
    private List<RegistroD500> registroD500;
    private List<RegistroD600> registroD600;
    private List<RegistroD695> registroD695;
    private List<RegistroD700> registroD700;
    private List<RegistroD750> registroD750;

    /**
     * @return the registroD001
     */
    public RegistroD001 getRegistroD001() {
        return registroD001;
    }

    /**
     * @param registroD001 the registroD001 to set
     */
    public void setRegistroD001(RegistroD001 registroD001) {
        this.registroD001 = registroD001;
    }

    /**
     * @return the registroD990
     */
    public RegistroD990 getRegistroD990() {
        return registroD990;
    }

    /**
     * @param registroD990 the registroD990 to set
     */
    public void setRegistroD990(RegistroD990 registroD990) {
        this.registroD990 = registroD990;
    }

    /**
     * @return the registroD100
     */
    public List<RegistroD100> getRegistroD100() {
        if (registroD100 == null) {
            registroD100 = new ArrayList<>();
        }
        return registroD100;
    }

    /**
     * @return the registroD300
     */
    public List<RegistroD300> getRegistroD300() {
        if (registroD300 == null) {
            registroD300 = new ArrayList<>();
        }
        return registroD300;
    }

    /**
     * @return the registroD350
     */
    public List<RegistroD350> getRegistroD350() {
        if (registroD350 == null) {
            registroD350 = new ArrayList<>();
        }
        return registroD350;
    }

    /**
     * @return the registroD400
     */
    public List<RegistroD400> getRegistroD400() {
        if (registroD400 == null) {
            registroD400 = new ArrayList<>();
        }
        return registroD400;
    }

    /**
     * @return the registroD500
     */
    public List<RegistroD500> getRegistroD500() {
        if (registroD500 == null) {
            registroD500 = new ArrayList<>();
        }
        return registroD500;
    }

    /**
     * @return the registroD600
     */
    public List<RegistroD600> getRegistroD600() {
        if (registroD600 == null) {
            registroD600 = new ArrayList<>();
        }
        return registroD600;
    }

    /**
     * @return the registroD695
     */
    public List<RegistroD695> getRegistroD695() {
        if (registroD695 == null) {
            registroD695 = new ArrayList<>();
        }
        return registroD695;
    }

    public List<RegistroD700> getRegistroD700() {
        if (registroD700 == null) {
            registroD700 = new ArrayList<>();
        }
        return registroD700;
    }

    public List<RegistroD750> getRegistroD750() {
        if (registroD750 == null) {
            registroD750 = new ArrayList<>();
        }
        return registroD750;
    }

}
