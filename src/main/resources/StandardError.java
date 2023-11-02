
package src.main.java.exceptions;

import java.io.Serializable;
import java.sql.Timestamp;

public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Timestamp timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    // Construtores, getters e setters
}

