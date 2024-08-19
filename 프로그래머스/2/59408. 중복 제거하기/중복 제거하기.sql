SELECT COUNT(DISTINCT NAME) #집계함수 사용 NAME 칼럼에서 중복된 것을 제거한 밸류 갯수 
FROM ANIMAL_INS # 테이블 ANIMAL_INS 에서
WHERE NAME IS NOT NULL #NAME 칼럼 중 NULL이 아닌 항목에 대해서만 적용