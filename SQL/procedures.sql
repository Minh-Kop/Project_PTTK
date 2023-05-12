CREATE OR REPLACE FUNCTION F_TAOMALP (
    NONVAR IN CHAR DEFAULT NULL
) 
RETURN CHAR 
AS
    I           INT := 1;
    MALP_       CHAR(3) := 'LP1';
    CHECKED     INT;
BEGIN
    LOOP
        SELECT COUNT(*) INTO CHECKED
        FROM QLKS.LOAIPHONG
        WHERE MALP = MALP_;
        
        EXIT WHEN CHECKED = 0;
        
        I := I + 1;
        MALP_ := 'LP' || TO_CHAR(I, 'FM0');
    END LOOP;

    RETURN MALP_;
END;
/
CREATE OR REPLACE PROCEDURE SYS.SP_TAOMALP (
    MALP_ OUT CHAR
) 
AS
    I           INT := 1;
    CHECKED     INT;
BEGIN
    MALP_ := 'LP1';
    LOOP
        SELECT COUNT(*) INTO CHECKED
        FROM QLKS.LOAIPHONG
        WHERE MALP = MALP_;
        
        EXIT WHEN CHECKED = 0;
        
        I := I + 1;
        MALP_ := 'LP' || TO_CHAR(I, 'FM0');
    END LOOP;
END;
/
