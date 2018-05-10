/*
[1���� ����]
1. ����Ŭ ����Ʈ���� �ٿ�ε�
>> http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html

2. 11g express ���� (�������) ��ġ

3. ��ġ (������ ���� : SYSTEM, SYS ���� : ��ȣ���� >> 1004

4. sqlplus �⺻ ���α׷� ����Ȯ��

5. SqlDeveloper ���� ���� ��ġ
  >> ���� �� -> ��� , ������ , sqlgate

6. Tool�� ���ؼ� Oracle ����
  >> HR ���� ��ȣ 1004 >> unlock
  >> BITUSER, 1004 >> ���� ����

-- USER SQL
CREATE USER bituser IDENTIFIED BY 1004 
DEFAULT TABLESPACE "USERS"
TEMPORARY TABLESPACE "TEMP";

-- QUOTAS
ALTER USER kosta QUOTA UNLIMITED ON USERS;

-- ROLES
GRANT "CONNECT" TO bituser ;
GRANT "RESOURCE" TO bituser ;

-- SYSTEM PRIVILEGES
*/

/*
SELECT [DISTINCT]  {*, column [alias], . . .}   
FROM  table_name   [WHERE  condition]  
[ORDER BY {column, expression} [ASC | DESC]]; 
*/

--1. ������̺��� ��� �����͸� ����ϼ���
select * from emp;
SELECT * FROM EMP; -- �������� ��ҹ��� ����x

--2. Ư�� �÷� ������ �����ϱ�
select empno, ename, job, sal from emp;
select empno from emp;
select hiredate, sal, comm from emp;

--3. �÷��� ����Ī(alias) �ο��ϱ�
select empno ���, ename �̸�
from emp;

select empno "��  ��", ename "��            ��"
from emp;

--����(ansi ����) >> ����
select empno as "��  ��", ename as "��            ��"
from emp;


--Oracle : ���ڿ�(���ڵ����� �����ϰ� ��ҹ��� ����)
--�ҹ��� : a, �빮�� : A �ٸ� ���� ���
select * from emp where ename = 'king'; --x
select * from emp where ename = 'KING'; --o
select * from emp where ename = 'King'; --x

--Oracle : ������(���� ������) >> || >> 'hello' || 'world' >> 'helloworld;
--Java : +������ (����+���� = ����)
--Java : +������ (����+���� = ����)
--TIP) ms-sql : + ����, ����

select '����� �̸���' || ename || '�Դϴ�' as "ename"
from emp;

--POINT ���̺��� ������ �÷��� �⺻ Ÿ��
--�÷��� ����Ÿ���ϱ�, ����Ÿ���ϱ�
--���� �⺻����
desc emp;

--����ȯ ����
select '����� �̸���' || sal || '�Դϴ�' as "ename"
from emp;


select empno || ename as "����" --���������� �ڵ� ����ȯ(���� -> ����)
from emp;

select empno + ename as "����" --���� ���� �۾� Error > "invalid number"
from emp;

--����� �츮ȸ�翡 ������ ��� �ֳ�?
--�ߺ� ������ ���� : Ű���� (distinct)
select distinct job from emp;

select distinct deptno from emp;

--distinct �� ���� (�÷��� 1�� �̻�)... grouping 
select distinct job, deptno from emp order by job;
select distinct deptno, job from emp order by deptno;

----------------------------------------------------------
--����Ŭ ���(SQL)
--Java �� ���� ���� (������)
--Java ���� ���� (% ������ >> ����Ŭ % �˻��������� ���) >> ������ �Լ� ������ Mod() �Լ�
--���(+ , - , * , / ....) Mod()�Լ�

--������̺��� ����� �޿��� 100�޷� �λ��� ����� ����ϼ���
select * from emp;
--1.�÷��� Ÿ��(Type) >> number
desc emp;
select empno, ename, sal, sal+100 as "�λ�޿�"
from emp;

select 100 + 100 from dual; -- ������ TEST �ӽ� dual;
select 100 || 100 from dual; -- ���� ���ڷ� �ڵ� ����ȯ(����)
select '100' + 100 from dual; -- ���� ���� ����ȯ
select 'A100' + 100 from dual; -- ���� ���� ����ȯ ������ ���ڷ� ����� �� ���� ERROR

-- �񱳿�����
-- > , < , <= ....
-- Java ����(==), �Ҵ�(=)
-- Oracle (=) ����, (!=) ���� �ʴ�

-- �� ������
-- AND, OR, NOT

/*
SELECT [DISTINCT]  {*, column [alias], . . .}   
FROM  table_name   [WHERE  condition]  
[ORDER BY {column, expression} [ASC | DESC]]; 
*/

--������ (���ϴ� row ������ ���ڴ�)
select *
from emp
where sal >= 3000;

select empno, sal
from emp
where  sal >= 3000;

--�̻�, ����(=����)
--�ʰ�, �̸�

--����� 7788���� ����� ���, �̸�, ����, �Ի����� ����ϼ���.
select empno, ename, job, hiredate
from emp
where empno = 7788;

--����� �̸��� king�� ����� ���, �̸�, �޿� ������ ����ϼ���
select empno, ename, sal
from emp
where ename = 'KING'; -- ��ҹ��� �����ϰ� ���� (varchar2(20)...)

--�� (AND, OR, NOT)
--�޿��� 2000�޷� �̻��̸鼭 ������ manager �� ����� ��� ������ ����ϼ���
select *
from emp
where sal >= 2000 and job = 'MANAGER';

--Ʃ�� �⺻ (�������)
--select 3��
--from   1��
--where  2��
-----------------------------------------------------------------------
--����Ŭ ��¥
--(������ ��¥)
--�ý��� (������Ʈ) ���� : ��¥ >> sysdate
--�Խ��� �۾��� : insert into board(writer, title, content, regdate)
--              values('ȫ�浿', '�氡�氡', '�ǰ��ؿ�', sysdate);
--TIP) ms-sql >> select getdate()
select sysdate from dual;

select hiredate from emp;
desc emp;

--����Ŭ �ý��� ������ ��� ���̺�
--ȯ�漳�� ����
select * from  SYS.NLS_SESSION_PARAMETERS;
--NLS_DATE_FORMAT  ->	 RR/MM/DD
--NLS_DATE_LANGUAGE  ->	 KOREAN
--NLS_TIME_FORMAT  ->	 HH24:MI:SSXFF
select * from  SYS.NLS_SESSION_PARAMETERS where parameter = 'NLS_DATE_FORMAT';

--������ ��ȯ
--���� ������ �����(session) �������� ����
--�ٸ� ������ bituser�� �ٸ� ����ڰ� �����ϸ�  >> NLS_DATE_FORMAT  ->	 RR/MM/DD
alter session set nls_date_format='YYYY-MM-DD HH24:MI:SS';
--bituser�� ������ü�ϰ� �ٽ� �����ϸ� 
--�ٲ� ���� �ƴ� �⺻������ ���ư���. (RR/MM/DD)

select sysdate from dual;
select hiredate from emp;

--����Ŭ ��¥ ǥ�� : '��¥'
--'1980-12-17' ���� ����
select * from emp
where hiredate = '1980-12-17';
--'1980/12/17' ���� ����
select * from emp
where hiredate = '1980/12/17';
--'1980.12.17' ����
select * from emp
where hiredate = '1980.12.17';
--'19801217' ����
select * from emp
where hiredate = '19801217';
--���ڸ� ������ ���� ������ �������

select * from emp
where hiredate = '80/12/17';--��¥ ����x :YYYY
--�� ������ RR-MM-DD ���Ŀ� ������

--����� �޿��� 2000�޷� �̻��̰� 4000�޷� ������ ��� ����� ����
select * 
from emp
where sal >= 2000 and sal <= 4000;

--������ : �÷��� between A and B (=�� ����)
select * 
from emp
where sal between 2000 and 4000;

--����� �޿��� 2000�޷� �̻��̰� 4000�޷� (�̸�)�� ��� ����� ����
select *
from emp
where sal between 2000 and 3999;


--�μ� ��ȣ�� 10�� �Ǵ� 20�� �Ǵ� 30���� ����� ���, �̸�, �޿�, �μ���ȣ�� ����ϼ���
select * 
from emp
where deptno = '10' or deptno = '20' or deptno = '30';

--IN ������ (���� or ���� or ....)
select * 
from emp
where deptno = '10' or deptno = '20' or deptno = '30';

--�μ� ��ȣ�� 10�� �Ǵ� 20���� �ƴ� ����� ���, �̸�, �޿�, �μ���ȣ�� ����ϼ���
--���� !=
select empno, ename, sal, deptno
from emp
where deptno != 10 and deptno != 20;

--NOT IN ������ (and ������, and ������)
select empno, ename, sal, deptno
from emp
where deptno not in (10,20);

--------------------------------
--btween A and B / in / not in--
--------------------------------

--POINT : ���� ����(�����Ͱ� ����) >> null
--�ʿ�� >> null
create table member(
 userid varchar2(20) not null,
 name varchar2(20) not null,
 hobby varchar2(20) --default null(null���� ����ϰڴ�) : �ʼ� �Է»����� �ƴϴ�.
);

select * from member;
insert into member(userid,hobby) values('hong', '��');--name not null;(����)
insert into member(userid,name) values('hong', 'ȫ�浿');
insert into member values('jun', '����ġ', null);
insert into member values('hong', 'ȫ�浿', '��');
--insert into member(userid, name, hobby) values('hong','ȫ�浿','��'); �̰͵� ����
commit; --�����ݿ�

delete from emp;
select * from emp;
rollback;

--������ ���� �ʴ� ��� ����� ������ ���
--select * from emp where comm = null; -- �������� ���� ���XXXXXX
select * from emp where comm is null; -- comm�÷�  null���� �������մ� ������

--������ �޴� ��� ����� ������ ��� (null�� �ƴ� ���)
select * from emp where comm is not null;

------------------------
--null�� ���� ��
-- is null / is not null
------------------------

--������̺��� ���, �̸�, �޿�, ����, �ѱ޿��� ����ϼ���
--�ѱ޿�(�޿� + ����)

--select empno, ename, sal, comm, sal+comm as "�ѱ޿�" from emp;
--�ѱ޿��� null���� ���� �� �ִ�.

--nvl(�÷���, null���� ������ ��)
select empno, ename, sal, comm,sal + nvl(comm, 0) as "�ѱ޿�" from emp;

--POINT  null
--null ���� ��� ������ �� ����� null�̴�
--�١١١١١١١١١١١١١١١١١١١١١١١١١١١١١�
--�� ������ �ذ� null ó�� �Լ� : nvl() �١١١١١١١١�
--�١١١١١١١١١١١١١١١١١١١١١١١١١١١١١�
--ms-sql : convert()
--my-sql : IFNULL()

select 1000 + null from dual;
select 1000 + nvl(null, 0) from dual;

select comm, nvl(comm, 0) from emp;
--���ڷε� ���� ����
select 'data' || nvl(null, 'HIHI') from dual;

--����� �޿��� 1000�̻��̰� ������ ���� �ʴ� ����� ���, �̸�, ����, �޿�, ������ ����ϼ���
select empno, ename, job, sal, comm from emp where sal >= 1000 and comm is null;

--------------------------------------------------------------------------------
--DQL (data query language) : select
--DDL(������ ���Ǿ�) : create, alter, drop : ��ü����, ����, ����

--class Board{private int boardid;}
create table board ( 
 boardid number not null, --�ʼ� �Է�(����)
 title varchar2(20) not null, --�ѱ� �� �� 2byte >> 10��, ������ Ư������ ���� >> 20��
 content varchar2(2000) not null,
 hp varchar2(20)
);

desc board;

--insert, update, delete �۾��ÿ��� (rollback, commit) �ݵ�� ����

INSERT INTO board(boardid, title, content) 
VALUES(100, '����Ŭ', '�� ����'); 

select * from board;
--�ǹݿ� : commit
--��� : rollback
commit;

insert into board(boardid, title, content)
values(200, '�ڹ�', '�׸���...');

select * from board;
--�Ǽ��ߴ� �̰� �ƴϾ�..
rollback;

insert into board(boardid, title, content, hp)
values(200, '�ڹ�','�׸���...','010...');

commit;

select boardid, nvl(hp,'EMPTY') as "hp" from board;
--nvl() �Լ��� ����, ��¥, ���� ��� ���밡���ϴ�.
----------------------------------------------------
--���ڿ� �˻�
--�����ȣ �˻�
--�ּҰ˻� : '����' �˻��ϸ� �����̶� ���ڰ� ����ִ� ��� ����
--���ڿ� ���� �˻� (like ������)

--like ������ (���ϵ� ī�� ���� (% : ��� �� , _ : �ѹ���) ����..
select boardid, nvl(hp,'EMPTY') as "hp" from board;
--A�� ����ִ� �̸��� ��� �˻�

--'A%' A�� �����ϴ�
--'%A' A�� ������

-- LL�� ����ִ�
select *
from emp
where ename like '%LL%';

--A��� ���ڰ� �پ��ִ� ����ִ� A�� �ι� ����ִ�
select *
from emp
where ename like '%A%A%';

--A�� �ι�° �ܾ��� ���
select ename
from emp
where ename like '_A%';

--���ڱ� 5�� �̰� S�� �������� ������ ����� �̸�
select ename
from emp
where ename like '____S';

--����Ŭ ����(regexp_like)
select * from emp where REGEXP_LIKE (ename, '[A-C]');
--���� ǥ���� (ǥ�� : java , oracle , script ...)
--���� ���͵� (�߰� ������Ʈ : ���� (����ǥ����))

----------------------------------------------------------------
--������ �����ϱ�
--order by �÷��� : ���� , ���� , ��¥
--�������� : asc ������
--�������� : desc ������

--�������� (������)
select * from emp order by sal;
select * from emp order by sal asc;
--�������� (������)
select * from emp order by sal desc;

--���ڿ��� ���밡��
select ename from emp order by ename;

--�Ի����� ���� ���� ������ �����ؼ� ���, �̸�, �޿�, �Ի��� ���
select empno, ename, sal, hiredate from emp order by hiredate desc;

/*
�������
select   3
from     1
where    2
order by 4(select����� ����)
*/

select empno, ename, sal, job, hiredate
from emp
where job='MANAGER'
order by hiredate desc;
--������ �Ŵ����� ���, �̸�, �޿�, ����, �Ի��� �� ���� �Ի��� ������ ���

--����
select deptno, job
from emp
order by deptno desc, job asc;
-- �μ���ȣ�� ������������ ���� �ϰ� �μ���ȣ�� ���� �� ������ ������������
-- grouping

---------------------------------------------------------------------
--������
--������(union) : ���̺�� ���̺��� �����͸� ��ġ�� �� (�ߺ����� ����)
--������(union all) : �ߺ��� ���

create table UTA(name varchar2(20));
insert into uta values('AAA');
insert into uta values('BBB');
insert into uta values('CCC');
insert into uta values('DDD');
commit;
select * from uta;


create table UT(name varchar2(20));
insert into ut values('AAA');
insert into ut values('BBB');
insert into ut values('CCC');
commit;
select * from ut;

select * from ut
union --�ߺ� �� ����
select * from uta;

select * from ut
union all --�ߺ� �� ���
select * from uta;

--union ��Ģ
--1. �����Ǵ� �÷��� Ÿ���� ����
select empno, ename from emp
union
select dname, deptno from dept; -- ����

select empno, ename from emp
union
select deptno, dname from dept;

--�ǹ� > subquery ����ؼ� unoin �� ���̺� �������̺� ó�� ���
select empno, ename
from (
 select empno, ename from emp
 union
 select deptno, dname from dept
) order by empno desc;

--2. �����Ǵ� �÷��� ������ ���� (null ������)
select empno, ename, job, sal from emp
union
select deptno, dname, loc, null from  dept;
-----
select empno, ename, job, sal from emp
union
select deptno, dname, loc, nvl(null, 0) from  dept;

--����Ŭ �Լ� (����Ŭ.pdf 49 page)
--1) ������ �Լ� : ���ڸ� �Է� �ް� ���ڿ� ���� �� ��θ� RETURN �� �� �ִ�.
--2) ������ �Լ� : ���ڸ� �Է� �ް� ���ڸ� RETURN �Ѵ�.
--3) ��¥�� �Լ� : ��¥���� ���� �����ϰ� ���ڸ� RETURN �ϴ� MONTHS_BETWEEN �Լ���
--               �����ϰ� ��� ��¥ ���������� ���� RETURN �Ѵ�.
--4) ��ȯ�� �Լ� : � ���������� ���� �ٸ� ������������ ��ȯ�Ѵ�.(to_char(), to_number(), to_date())
--5) �Ϲ����� �Լ� : NVL(), DECODE()

--���ڿ� �Լ�
select initcap('the super man') from dual; --�ܾ��� ù���� �빮��

select lower('AAA'), upper('aaaaa') from dual; --aaa, AAAAA
select ename, lower(ename) as " ename" from emp; 

select * from emp where lower(ename) = 'king';

--������ ���� (length)
select length('abcd') from dual; --4
select length('ȫ�浿') from dual; --3

select length('ȫa�� ��') from dual; --5

--���� ������ ||
select 'a' || 'b' from dual;
--�Լ� (�Լ��� �Ķ������ ������ �������̶� Ȯ�强���� ||�� ���� �����̴�)
select concat('a','b') from dual;

select concat(ename, job) from emp; 
select ename||' '||job from emp;

--�κ� ���ڿ� ����
--java(substring)
--oracle(substr)
select substr('ABCDE',2,3) from dual; --BCD
select substr('ABCDE',1,1) from dual; --�ڱ��ڽ� : A
select substr('ABCDE',3,1) from dual; --�ڱ��ڽ� : C
select substr('ABCDE',3) from dual;
select substr('ABCDE',-2,1) from dual; --�ڿ��� -1 -2

--Quiz
/*
������̺��� ename �÷� �����Ϳ� ���ؼ� ù���ڴ� �ҹ��ڷ�
������ ���ڴ� �빮�ڷ� ����ϵ� �ϳ��� �÷����� ���
-- �÷��� ����Ī : fullname
-- ù���ڿ� ������ ���� ���̿� �����ϳ� �־��
-- ex) SMITH : s MITH
*/

select substr(lower(ename),1,1) || ' ' || substr(ename,2) as "fullname"
from emp;

--lpad, rpad (ä���)
select lpad('ABC',10,'*') from dual;

select rpad('ABC',10,'*') from dual;

--Quiz
--����� ��� : hong1006
--ȭ�� : ho****** ���� ����ϰ� �;�� (���࿡ 1004 >> 10**)
select rpad(substr('hong1006',1,2),length('hong1006'),'*') from dual;
--emp ���̺��� ename �÷��� ������ ����ϴµ� ù���ڸ� ����ϰ� �������� *����ϼ���
select rpad(substr(ename,1,1),length(ename),'*') from emp; 

create table member2(
 id number,
 jumin varchar2(14)
);

select * from member2;

insert into member2(id, jumin) values(100, '123456-1234567');
insert into member2(id, jumin) values(200, '234567-1234567');
commit;

--Quiz
--��°��
--�ϳ��� �÷� ������
--100 : 123456-*******
--200 : 234567-*******
--����Ī "jumin"
select id || ':' || rpad(substr(jumin,1,7),length(jumin),'*')as"jumin" from member2;

--rtrim �Լ�
--[������ ����] ������
--�����ʿ��� �ڽ��� ������ ���ڰ� �ִٸ� ������
select rtrim('MILLER', 'ER') from dual;
--ltrim �Լ� [����]
select ltrim('MILLLLLLLLLLLLLLLLLER', 'MIL') from dual;
--����) ���� ���ڰ� ���������� ������ ���� �����.


--ġȯ�Լ�
select ename, replace(ename, 'A','�Ϳ�') from emp;

-------------------------[���ڿ� �Լ� END]----------------------------

--[�����Լ�]
--round (�ݿø�)
--trunc (�����Լ�)
--������ ���ϴ� �Լ� mod()


-- -3 -2 -1 0(����) 1 2 3
--    .(����)�� �������� 
select round(12.345,0) as "r" from dual; -- �����θ� ���ܶ� 12
select round(12.567,0) as "r" from dual; -- 13

select round(12.345,1) as "r" from dual; -- 12.3
select round(12.567,1) as "r" from dual; -- 12.6

select round(12.345,-1) as "r" from dual; -- 10
select round(15.345,-1) as "r" from dual; -- 20
select round(15.345,-2) as "r" from dual; -- 0

--trunc (�ݿø� ���� �ʰ� ������)
select trunc(12.345,0) as "r" from dual; -- 12
select trunc(12.567,0) as "r" from dual; -- 12

select trunc(12.345,1) as "r" from dual; -- 12.3
select trunc(12.567,0) as "r" from dual; -- 12.5

select trunc(12.567,-1) as "r" from dual; -- 10
select trunc(15.567,-1) as "r" from dual; -- 10

select trunc(15.567,-2) as "r" from dual; -- 0

--������
select 12/10 from dual;
select mod(12,10) from dual; --������ 2
select mod(0,0) from dual;

----------------------[���� �Լ� END]-------------------------

--��¥ �Լ� : sysdate
--��¥ ���� (POINT)
--Date + Number >> Date
--Date - Number >> Date
--Date - Date >> Number(�ϼ�)

Select * from SYS.NLS_SESSION_PARAMETERS where parameter = 'NLS_SESSION_PARAMETERS';

select sysdate from dual;
select hiredate from emp;

select MONTHS_BETWEEN('2018-02-27', '2010-02-27') from dual;

select MONTHS_BETWEEN(sysdate, '2010-01-01') from dual;

select round(MONTHS_BETWEEN(sysdate,'2010-01-01'),1) from dual;
select trunc(MONTHS_BETWEEN(sysdate,'2010-01-01'),1) from dual;

select to_date('2015-04-25') + 1000 from dual;

select sysdate + 100 from dual;

--quiz
/*
  1.������̺��� ������� �Ի��Ͽ��� ���� ��¥(sysdate) ������ �ټӿ����� ���ϼ���
  ��, �ټӿ����� �����κи� ���⼼��
  
  2.�Ѵ��� 31�� �̶�� �����ϰ� �ټӿ����� ���ϼ���
*/

select trunc(MONTHS_BETWEEN(sysdate,hiredate),0)||'��' as "�ټӿ���" from emp;

select trunc((sysdate-hiredate)/31,0)||'��' as "�ټӿ���2" from emp;

-----------------------[��¥ �Լ� END]--------------------------
--�����Լ�
--�����Լ�
--��¥�Լ� 
--END
---------------------------------------------------------------
--[��ȯ�Լ�] POINT
--Oracle : ����, ����, ��¥
--to_char() : ���� -> ���� (���ڸ� ���ڷ�)
--            ��¥ -> ���� (��¥�� ���ڷ�)

--�������� ������ 60%
--to_date() : ���� -> ��¥ >> select '2018-12-12' + 1000
--            >> select to_date('2018-12-12')...
--�ڵ�����ȯ �ȴ�.
select '100' + 100 from dual;
select to_number('100') + 100 from dual;

/*
����Ŭ �⺻ Ÿ��(������ Ÿ��)
create table ���̺�� (�÷��� Ÿ��);
create table member (age number); n���� ������ insert
--java -> class memeber{ int age; } >> member m = new memeber(); 1rjs
--java -> List<member> list = new ArrayList<>(); list.add(new member()) n��

���� Ÿ��
--char(20) -> 20byte -> �ѱ�10��/ ������,Ư������,���� 20�� -> �������� ���ڿ�
--varchar2(20) -> 20byte -> �ѱ�10��/ ������,Ư������,���� 20�� -> �������� ���ڿ�

char(20) -> 'ȫ�浿' -> 20byte ��� ���
varchar2(20) -> 'ȫ�浿' -> 20byte �� 6byte�� ���

�����ȵ����� : ��, �� >> ó�� >> char(2)�� ����ض� (����)
�ᱹ >> varchar2(2)

���� ���� ����)
char() .... varchar2() ���� �˻��� �켱....

�ᱹ ������ �ѱ�
unicode(2byte) :  �ѱ�, ������, Ư������, ���� >> 2byte
nchar(20) >> 20�� ������ ���� >> ���� byte*2 >> 40byte
nvarchar2(20) >> 20���� ����

�ѱ�, ������, Ư��, ���� 20��

*/
---------------------------------------------------------
--1. to_number() : ���ڸ� ���ڷ� 
select 1 + 1 from dual; --2

select '1' + 1 from dual; --�ڵ�����ȯ

select to_number('1') + 1 from dual;

select '1' + '1' from dual; -- + �� ������ ���� (||�� ���ڿ� ����)
---------------------------------------------------------
--2. to_char() : ���ڸ� ���ڷ� (���� -> ����(���Ĺ���))
--               ��¥�� ���ڷ� (��¥ -> ����(���Ĺ���))
select sysdate from dual;
--YYYY YY MM DD ... ���ǵǾ� �־��

select sysdate || '��' from dual;
--��Ģ
select to_char(sysdate) || '��' from dual;

select sysdate,
to_char(sysdate, 'YYYY')||'��' as "YYYY",
to_char(sysdate, 'YEAR') as "YEAR",
to_char(sysdate, 'MM')||'��' as "MM",
to_char(sysdate, 'DD')||'��' as "DD",
to_char(sysdate, 'DAY') as "DAY",
to_char(sysdate, 'DY')||'����' as "DY"
from dual;

--Quiz
--�Ի����� 12���� ������� ���, �̸�, �Ի���, �Ի�⵵, �Ի���� ����ϼ���
select empno, ename, hiredate,
to_char(hiredate, 'YYYY')||'��' as "�Ի�⵵",
to_char(hiredate, 'MM')||'��' as "�Ի��" 
from emp where to_char(hiredate, 'MM') = '12';

select empno, ename, hiredate,
to_char(hiredate, 'YYYY"��"') as "�Ի�⵵",
to_char(hiredate, 'MM"��"') as "�Ի��" 
from emp where to_char(hiredate, 'MM') = '12';

select to_char(hiredate,'YYYY MM DD') as "����" from emp;
select to_char(hiredate,'YYYY"��" MM"��" DD"��') as "����" from emp;

--------------
--to_char() : ���� -> ����
--why : 10000000 -> $1,000,000,000 �̷� ������ ���ڵ����� to_char()
select '>' || to_char(12345, '9999999999999') || '<' from dual;
select '>' || to_char(12345, '0999999999999') || '<' from dual;
select '>' || to_char(12345, '0000000000000') || '<' from dual;

select '>' || to_char(12345, '$9,999,999,999,999') || '<' from dual;

select to_char(sal,'$999,999') as "sal"
from emp;

/*
select * from employees;

--HR �������� �����ؼ�
--������̺��� ����� �̸��� last_name, firist_name ���ļ� full_name ��Ī���� ���
--�Ի����� YYYY-MM-DD �������� ����ϰ�
--����(�޿�*12)�� ���ϰ� ���
--������ 10%(���� * 1.1)�λ��� ���� ���
--�� ����� 1000���� (,) ó���ؼ� ���
--��, 2005�� ���� �Ի��ڵ鸸 ���
--������ ���� ������ ���

select employee_id, first_name, last_name, hire_date, salary
from employees;

select last_name || ' ' || first_name as "full_name",
to_char(hire_date, 'YYYY"-"MM"-"DD') as "�Ի���",
to_char(salary*12, '999,999') as "����",
to_char((salary*12)*1.1, '999,999') as "�λ󿬺�"
from employees where to_char(hire_date, 'YYYY') >= '2005'
order by "����" desc;

*/

--------------------------------------------------------------

--to_date() ���ڸ� ��¥��

select to_date('2018-12-12', 'YYYY-MM-DD') from dual; -- 2018-12-12 00:00:00

select '2018-12-12' + 100 from dual; -- ����������������
select to_date('2018-12-12') + 100 from dual;

-------------[��ȯ�Լ� : to_number(), to_char(), to_date()] END-------------
--����
--����
--��¥
--��ȯ(to_char ...)
---------------------------------------------------------------------------
--[�Ϲ��Լ�]
--���α׷����� ������ ���ϴ�..
--nvl(), nvl2() --> nulló�� �Լ�
--decode() �Լ� --> java if..
--case() �Լ� --> java switch..

select comm, nvl(comm, 0) from emp;

create table t_emp(
 id number(6),
 job varchar2(20)
);

insert into t_emp(id, job) values(100, 'IT');
insert into t_emp(id, job) values(200, 'SALES');
insert into t_emp(id, job) values(300, 'MGR');
insert into t_emp(id, job) values(400, NULL);
insert into t_emp(id, job) values(500, 'MGR');
commit;

select * from t_emp;

--1.nvl()
select id, job, nvl(job, 'Empty...') from t_emp;

--2.nvl2() , null�� ��� ó��, null�� �ƴ� ��� ó��
--job �� null �ƴϸ� �� / null�̸� ��
select id, job, nvl2(job,'AAA', 'BBB') from t_emp;

select id, job, nvl2(job,job || '�Դϴ�', 'empty') from t_emp;

--3.decode POINT (�Ϲ� SQL ����� ���� if, switch)
--decode(ǥ����, ����1, ���1, ����2, ���2, ����3, ���3 ...... , ���ǿ� �ش�x���)
--����� ������ ǥ���� �ַ� ���..
select id, job, decode(id, 100, 'IT...',
                           200, 'SALES...',
                           300, 'MGR...',
                           'ETC...') as "dexodejob"
from t_emp;

select job, decode(job, 'IT', job, 'SALES', job, 'MGR', job, 'empty') from t_emp;
--Ȱ��
select count(decode(job, 'IT', 1)) as "IT", count(decode(job, 'SALES', 1)) as "SALES", 
count(decode(job, 'MGR', 1)) as "MGR" from t_emp;

/*
emp ���̺��� �μ���ȣ�� 10�̸� '�λ��', 20 '������', 30 'ȸ���',
������ '��Ÿ�μ�' ��� ����ϴ� ������
decode�� ����ؼ�
*/
select decode(deptno, 10, '�λ��', 20, '������', 30, 'ȸ���', '��Ÿ�μ�') as "deptno"
from emp;


--Quiz
create table t_emp2(
 id number(2),
 jumin char(7)
);
insert into t_emp2(id, jumin) values(1,'1234567');
insert into t_emp2(id, jumin) values(2,'2234567');
insert into t_emp2(id, jumin) values(3,'3234567');
insert into t_emp2(id, jumin) values(4,'4234567');
insert into t_emp2(id, jumin) values(5,'9234567');
commit;

/*
  t_emp2 ���̺��� id , jumin �����͸� ����ϵ� jumin �÷��� ���ڸ����� 1�̸� ����
  2�̸� ���� , 3�̸� �߼� �� �ܴ� ��Ÿ�� ����ϼ���
  ��µǴ� �÷����� gender �� �ϼ���
*/
  
select id, decode(substr(jumin, 1, 1), 1, '����', 2, '����', 3, '�߼�', '��Ÿ')as "gender"
from t_emp2;

--���̵� �߱�
--java if() {   if(){}  } ��ø if��
--oracle : decode(decode())
/*
�μ���ȣ�� 20���� ����߿��� SMITH ��� �̸��� ���� ����̶�� HELLO ���� ����ϰ�
�μ���ȣ�� 20���� ����߿��� SMITH ��� �̸��� ���� ����� �ƴ϶�� WORLD ���� ����ϰ�
�μ���ȣ�� 20���� ����� �ƴ϶�� ETC ��� ���ڸ� ����ϼ���
*/
select decode(deptno, 20, decode(ename, 'SMITH', 'HELLO', 'WORLD'), 'ETC') from emp;

--CASE��
/*
CASE ���� WHEN ���1 THEN ���1
                 WHEN ���2 THEN ���2
                 WHEN ���3 THEN ���3
                 WHEN ���4 THEN ���4
                 ELSE ���5
END "�÷���"                 
*/
create table t_zip(
  zipcode number(10)
);

insert into t_zip(zipcode) values(2);
insert into t_zip(zipcode) values(31);
insert into t_zip(zipcode) values(32);
insert into t_zip(zipcode) values(33);
insert into t_zip(zipcode) values(41);
commit;

select * from t_zip;


select '0' || to_char(zipcode),
      case zipcode when 2 then '����'
                   when 31 then '���'
                   when 32 then '����'
                   when 41 then '��û��'
                   else '��Ÿ����'
      end as "regionname"
from t_zip;


/*
������̺��� ����޿��� 1000�޷� ���ϸ� 4��
1001 �޷� 2000�޷� ���ϸ� 3��
2001 �޷� 3000�޷� ���ϸ� 2��
3001 �޷� 4000�޷� ���ϸ� 1��
4001 �޷� �̻��̸� Ư���� �ο��ϴ� �����͸� ����ϼ���

1. case �÷��� when ��� then ���     (= �� ���� ��)
              when ��� then ���
              else ���
   end
2. case when �÷��� ���Ǻ񱳱��� then ���   (ex: sal < 2000 )
        when �÷��� ���Ǻ񱳱��� then ���
        else ���
   end
*/

select case when sal <= 1000 then '4��'
            when sal between 1001 and 2000 then '3��'
            when sal between 2001 and 3000 then '2��'
            when sal between 3001 and 4000 then '1��'
            else 'Ư��'
       end as "�޿����" , empno, ename, sal
from emp;

-----------------------------------------------------------------
--���� >> ���� >> ��¥ >> ��ȯ(to_char(), to_number(), to_date() >> �Ϲ��Լ� (nvl(), ~case) >>

--�����Լ�
--����Ŭ.pdf (75Page)

--[�����Լ�]
--1. count(*) :  ���δ����� �о ����� �ִ°� Ȯ�� 
--   count(�÷���) >> ������ �Ǽ�
--2. sum()
--3. avg()
--4. max()
--5. min()
--���

/*
1. �����Լ��� �ݵ�� (group by ���) ���� ���
2. POINT : ��� �����Լ�(�׷��Լ�)�� null ���� ����
3. POINT : select ���� �����Լ� �ܿ� �ٸ� �÷��� ���� �ݵ�� group by ���� ��õǾ�� �Ѵ�.
*/

select count(*) from emp; -- 14��

select count(empno) from emp; --empno ������ ��� ���� (�� null �� ����) => 14��
select count(comm) from emp; --comm ������ ��� ���� (�� null �� ����) => 6��

select count(nvl(comm, 0)) from emp; --comm ������ null�� 0���� => 14��

--�޿��� ��
select sum(sal) from emp;

--��� �޿� (�޿��� �� / �Ǽ�)
select round(avg(sal), 0) from emp; --�ݿø��� ��� �޿�

select round(sum(sal)/count(sal), 0) from emp;

--������� ȸ�� ������ �� �� ���޵���?(���)
select sum(comm) as "sum" from emp; -- 4330
--(���� �޴� ����߿� ������...721)
select trunc(avg(comm),0) as "gvg" from emp; -- 721
--(������� ������...309)
select trunc(avg(nvl(comm, 0)),0) as "gvg" from emp; -- null ���� �����߱⿡ null���� 0���� ����

--����
--ȸ���� �������� �ٸ���(������� ������...309)(���� �޴� ����߿� ������...721)
select comm from emp;
select (300+200+30+300+3500+0) / 14 from dual; -- 309

----------------------------------------------------

--POINT : �����Լ��� �����[�÷� 1��]
select sum(sal), avg(sal), max(sal), count(sal), count(*) from emp;

----------------------------------------------------
--�μ��� ��� �޿��� ����ϼ���
select deptno, avg(sal)
from emp
group by deptno;

select deptno, avg(sal) from emp; -- ����

--�������
--select   3��
--from     1��
--group by 2��

select avg(sal)
from emp
group by deptno; --������ ���� ��ȣ (�˼� ����)

--������ ��ձ޿�, �޿���, �ִ�޿�, �ּұ޿�, �Ǽ� �� ����ϼ���
select job, avg(sal), sum(sal), max(sal), min(sal), count(job)
from emp
group by job;

/*
grouping ����
--distinct �÷���1, �÷���2
--order by �÷���1, �÷���2
--group by
*/

--�μ���, ������ �޿��� ���� ���ϼ���
select deptno, job, sum(sal), count(job)
from emp
group by deptno, job
order by deptno;

/*
select       4��
from         1��
where        2��
group by     3��
order by     5��
*/

/*
������ ��ձ޿��� 3000�޷� �̻��� ����� ������ ��ձ޿��� ����ϼ���
--���� : ������ ��ձ޿� >= 3000
--��ձ޿� >= 3000 ���������� >> ��ձ޿� >> ���� >> group by...
--�� > group by ����
--group by ���� : having ��
*/
select job, avg(sal)
from emp
group by job
having avg(sal) >= 3000;

/*
������̺��� ������ �޿����� ����ϵ� ������ ���� �ް� �޿��� ���� 5000 �̻��� ����� ����� ����ϼ���
--��, �޿��� ���� ���� ������ ����ϼ���
*/
select job, sum(sal)as"sumsal"
from emp
where comm is not null
group by job
having sum(sal) >= 5000
order by "sumsal" asc;
/*
������̺��� �μ��ο��� 4���� ���� �μ��� �μ���ȣ, �ο���, �޿��� ���� ����ϼ���
*/
select deptno, count(deptno) as "�μ��� �ο�" , sum(sal) as "�޿��� ��"
from emp
group by deptno
having count(deptno) > 4;

/*
������̺��� ������ �޿��� ���� 5000�� �ʰ��ϴ� ������ �޿��� ���� ����ϼ���
��, �Ǹ�����(salesman)�� �����ϰ� �޿������� ������������ �����ϼ���
*/
select job, sum(sal) as "�޿��� ��"
from emp
where job != 'SALESMAN'
group by job
having sum(sal) > 5000
order by "�޿��� ��" desc;

-------------------------------------------------------------
--[����(JOIN)] : �������̺��� �����͸� �˻��ϴ� ���
--Oracle.pdf(p85)
--����
--1. �����(equi join) => 70%
--�����̺�� ������� ���̺� �ִ� �÷��� �����͸� 1:1 ����
--[ANSI  ����]
--���� : join  on ~������
--���� : [inner] join on ~������ ������


--2. ������(non-equi join) => �ǹ̸� ���� => ���� �����
--�����̺�� ������� ���̺� �ִ� �÷��� 1:1 ���ε��� �ʴ� ���
--ex) emp , salgrade : ����� ��� �˻� �÷� 2�� ��� (losal , hisal)  


--3.outer join(equi join + null) => equi join null ó�� �ȵǿ�
--outer join (�ΰ��� ���̺��� �� , �� ���� �ľ�)
--���� : left outer join  (���� �� , ������ ��)
--      right outer join  (������ �� , ���� ��)
--      full outer join   (left , right join > union �ϸ�)


--4. self join (�ڱ�����) => �ǹ̸� ���� => ���� �����
--ex) emp ���̺��� smith ������ �̸��� �����Դϱ�
--�ϳ��� ���̺�ȿ��� �÷��� �ٸ� �÷��� �����ϴ� ���
---------------------------------------------------------------------
--���� �ǽ� ���̺� ����

create table M (M1 char(6) , M2 char(10));
create table S (S1 char(6) , S2 char(10));
create table X (X1 char(6) , X2 char(10));

insert into M values('A','1');
insert into M values('B','1');
insert into M values('C','3');
insert into M values(null,'3');
commit;

insert into S values('A','X');
insert into S values('B','Y');
insert into S values(null,'Z');
commit;

insert into X values('A','DATA');
commit;

select * from m;
select * from s;
select * from x;

---------------------------------------
select *
from m,s
where m.m1 = s.s1;

--oracle join���� (ANSI ���� x)
select m.m1, m.m2, s.s2
from m, s
where m.m1 = s.s1;

--��� join �������̰� ����� from ���������� ��ȣ�ϴ�....
select m.m1, m.m2, s.s2
from m, s
where m.m1 = s.s1 and m.m1 ='A';

--ANSI ���� ����
select m.m1, m.m2, s.s2
from m join s
on m.m1 = s.s1;

--���� ���(select *....) >> �ʿ� �÷��� ����
--select empno, emp.deptno ���� ������ emp. �ٿ�����
select emp.empno,
       emp.ename,
       emp.deptno,
       dept.dname       
from emp join dept
on emp.deptno = dept.deptno;

--���̺� ����Ī �ο�(���� ���������� ���̺��̸��� ��� ... ��Ī �ο�)
select e.empno,
       e.ename,
       e.deptno,
       d.dname       
from emp e join dept d
on e.deptno = d.deptno;


select s.s1, x.x2
from s join x
on s.s1 = x.x1;

------------------------------------------------------------
--join �԰� �̻��� ���̺�
--oracle sql join ����
select m.m1, m.m2, s.s2, x.x2
from m, s, x
where m.m1 = s.s1 and s.s1 = x.x1;

--ANSI����(����)
select m.m1, m.m2, s.s2, x.x2
from m join s on m.m1 = s.s1 
       join x on s.s1 = x.x1;

--------------------------------------------------------
--1.HR �������� �̵�
select * from employees;
select * from departments;
select * from locations;

--employees, departments
--1.���, �̸�(last_name), �μ���ȣ, �μ��̸��� ����ϼ���
select e.employee_id, e.last_name, e.department_id, d.department_name
from employees e join departments d
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
order by e.employee_id;

--������ : ����� 107�� >> ��� 106��(������ ����)
select * from employees where department_id is null;

--�μ���ȣ�� null�� ����� ���� ��� �ϴ� ���
--��������δ� �ذ� �� �� ����......outer join���� �ذ�

------------------------------------------------------------
--������

select * from emp;
select * from salgrade;

--���, �̸�, �μ���ȣ, �޿�, �޿����
select e.empno, e.ename, e.deptno, e.sal, s.grade
from emp e join salgrade s
on e.SAL between s.LOSAL and s.HISAL;

--���, �̸�, �μ���ȣ, �μ���, �޿�, �޿����
select e.empno, e.ename, e.deptno, d.dname, e.sal, s.grade
from emp e join salgrade s on e.SAL between s.LOSAL and s.HISAL
           join dept d on e.DEPTNO = d.DEPTNO;

--2.���, �̸�, �μ���ȣ, [�μ���], �����ڵ�, [������] �� ����ϼ���
select * from employees;
select * from departments;
select * from locations;

select e.EMPLOYEE_ID,
       e.LAST_NAME,
       e.DEPARTMENT_ID,
       d.DEPARTMENT_NAME,
       d.LOCATION_ID,
       l.CITY
from employees e join departments d on e.DEPARTMENT_ID = d.DEPARTMENT_ID
                 join locations l on d.LOCATION_ID = l.LOCATION_ID;

-------------------------------------------------------------------
/*
outer join (equi join + null(���� ������) -> equi join null ó�� �ȵǿ�
outer join (�� ���� ���̺��� ��, �� ���� �ľ�)

���� : 
left outer join (���� ��, ������ ��)
right outer join (������ ��, ���� ��)
full outer join (left, right join > union �ϸ�)

���������� ������� �����ϰ� (��, ��) ���Ը� �ľ��ؼ�
���� �Ǵ� ���̺��ִ� ���� �����͸� ������ ���� ��
*/

select *
from m join s
on m.m1 = s.s1;

select *
from m left outer join s
on m.m1 = s.s1;

select *
from m right outer join s
on m.m1 = s.s1;

select *
from m full outer join s
on m.m1 = s.s1;

--HR �������� ����
select * from employees;
select * from departments;
select * from locations;

--employees, departments
--1.���, �̸�(last_name), �μ���ȣ, �μ��̸��� ����ϼ���
select e.employee_id, e.last_name, e.department_id, d.department_name
from employees e join departments d
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
order by e.employee_id;

--������ : ����� 107�� >> ��� 106��(������ ����)
select * from employees where department_id is null;

--�μ���ȣ�� null�� ����� ���� ��� �ϴ� ���
--��������δ� �ذ� �� �� ����......outer join���� �ذ�

--���������� ����

select e.employee_id, e.last_name, e.department_id, d.department_name
from employees e left outer join departments d
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
order by e.employee_id;
----------------------------------------------------------------------

--self join(�ڱ�����) -> ���� >> �����
--�ϳ��� ���̺��� �÷��� �ٸ� �÷��� �����ϴ� ���
select e.empno, e.ename, e2.empno, e2.ename
from emp e join emp e2
on e.mgr = e2.empno;
--����� 14���� 13�� ��µ�
--�ذ�(null��)
select e.empno, e.ename, e2.empno, e2.ename
from emp e left join emp e2 -- salf join �ϳ��� ���̺��� 2�� ó��(���̺� ����Ī �ο��ؼ�)
on e.mgr = e2.empno;

select *
from m, s; --������ ������ ���� �� �ִ� ��� ����� ���� ����
--where m.m1 = s.s1 

--------------------------------------------------------------------------------

-- 1. ������� �̸�, �μ���ȣ, �μ��̸��� ����϶�.
select e.ename, e.deptno, d.dname
from emp e join dept d
on e.deptno = d.deptno;

SELECT E.ENAME, E.DEPTNO, D.DNAME
FROM EMP E  join DEPT D on E.DEPTNO=D.DEPTNO;

-- 2. DALLAS���� �ٹ��ϴ� ����� �̸�, ����, �μ���ȣ, �μ��̸���
-- ����϶�.
select e.ename, e.job, e.deptno, d.dname
from emp e join dept d
on e.deptno = d.deptno
where d.loc = 'DALLAS';

SELECT E.ENAME, E.JOB, D.DEPTNO, D.DNAME
FROM EMP E  join DEPT D on E.DEPTNO=D.DEPTNO
WHERE  D.LOC='DALLAS';
-- 3. �̸��� 'A'�� ���� ������� �̸��� �μ��̸��� ����϶�.
select e.ename, d.dname
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where e.ename like '%A%';

SELECT E.ENAME, D.DNAME
FROM EMP E  join DEPT D  on D.DEPTNO=E.DEPTNO
WHERE  E.ENAME LIKE '%A%';

-- 4. ����̸��� �� ����� ���� �μ��� �μ���, �׸��� ������
--����ϴµ� ������ 3000�̻��� ����� ����϶�.
select e.ename, d.dname, e.sal
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where sal >= 3000;
 
SELECT E.ENAME, D.DNAME, E.SAL ,D.DNAME
FROM EMP E  join DEPT D on E.DEPTNO=D.DEPTNO
WHERE E.SAL>=3000;
-- 5. ����(����)�� 'SALESMAN'�� ������� ������ �� ����̸�, �׸���
-- �� ����� ���� �μ� �̸��� ����϶�.
select e.ename, d.dname
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where e.job = 'SALESMAN';

SELECT E.JOB, E.ENAME, D.DNAME
FROM EMP E  join DEPT D on E.DEPTNO=D.DEPTNO
WHERE E.JOB='SALESMAN';
-- 6. Ŀ�̼��� å���� ������� �����ȣ, �̸�, ����, ����+Ŀ�̼�,
-- �޿������ ����ϵ�, ������ �÷����� '�����ȣ', '����̸�',
-- '����','�Ǳ޿�', '�޿����'���� �Ͽ� ����϶�.
--(�� ) 1 : 1 ���� ��� �÷��� ����
select e.empno as "�����ȣ",
       e.ename as "����̸�", 
       e.sal*12 as "����",
       (e.sal*12)+e.comm as "�Ǳ޿�",
       s.grade as "�޿����" 
from emp e join salgrade s
on e.sal between s.losal and s.hisal
where e.comm is not null;

SELECT E.EMPNO AS "�����ȣ",
               E.ENAME AS "����̸�",
               E.SAL*12 AS "����",
           --E.SAL*12+NVL(COMM,0) AS "�Ǳ޿�",
               E.SAL*12+COMM AS "�Ǳ޿�",
               S.GRADE AS "�޿����"
FROM EMP E inner join SALGRADE S on E.SAL BETWEEN S.LOSAL AND S.HISAL
WHERE E.Comm is not null;

-- 7. �μ���ȣ�� 10���� ������� �μ���ȣ, �μ��̸�, ����̸�,
-- ����, �޿������ ����϶�.
select e.DEPTNO, d.dname, e.ename, e.sal, s.GRADE
from emp e join dept d on e.DEPTNO = d.DEPTNO
           join salgrade s on e.sal between s.losal and s.hisal
where e.deptno = 10;

SELECT E.DEPTNO, D.DNAME, E.ENAME, E.SAL, S.GRADE
FROM EMP E   join DEPT D on E.DEPTNO=D.DEPTNO
                         join SALGRADE S on E.SAL BETWEEN S.LOSAL AND S.HISAL
WHERE E.DEPTNO=10;

-- 8. �μ���ȣ�� 10��, 20���� ������� �μ���ȣ, �μ��̸�,
-- ����̸�, ����, �޿������ ����϶�. �׸��� �� ��µ�
-- ������� �μ���ȣ�� ���� ������, ������ ���� ������
-- �����϶�.
select e.DEPTNO, d.dname, e.ename, e.sal, s.GRADE
from emp e join dept d on e.DEPTNO = d.DEPTNO
           join salgrade s on e.sal between s.losal and s.hisal
where e.deptno in (10, 20)
order by e.deptno asc, e.sal desc;
 
SELECT E.DEPTNO, D.DNAME, E.ENAME, E.SAL, S.GRADE
FROM EMP E  join DEPT D               on E.DEPTNO=D.DEPTNO
                        join SALGRADE S       on E.SAL BETWEEN S.LOSAL AND S.HISAL
WHERE  E.DEPTNO<=20 --WHERE E.DEPTNO IN (10,20)  -- e.deptno = 10 or 
ORDER BY E.DEPTNO ASC,  E.SAL DESC;
 
-- 9. �����ȣ�� ����̸�, �׸��� �� ����� �����ϴ� ��������
-- �����ȣ�� ����̸��� ����ϵ� ������ �÷����� '�����ȣ',
-- '����̸�', '�����ڹ�ȣ', '�������̸�'���� �Ͽ� ����϶�.
--SELF JOIN (�ڱ� �ڽ����̺��� �÷��� ���� �ϴ� ���)
select e.empno as "�����ȣ",
       e.ename as "����̸�",
       e2.empno as "�����ڹ�ȣ",
       e2.ename as "�������̸�"
from emp e left join emp e2
on e.mgr = e2.empno;

SELECT E.EMPNO, E.ENAME , M.EMPNO, M.ENAME
FROM EMP E  left outer join EMP M
on e.MGR = m.EMPNO;

--------------------------------------------------------------
--[subquery] ����Ŭ.pdf (100page)
--sql�� �� >> sql�� ���� �ذ��

--������̺��� ������� ��� ���޺��� �� ���� �޿��� �޴� ����� ���, �̸�, �޿��� ���
select empno, ename, sal
from emp
where sal > (select avg(sal) from emp);

--������ �ۼ� ����
--�Լ� >>> ���� >>> subquery (������ ����)

/*
subquery
����
1.single row subquery : ���������� ����� 1���� row(���ϰ�) : �Ѱ��� �� (���� �÷�)

2.multi row subquery : ���������� ����� 1�� �̻��� row : �������� �� (���� �÷�)

�����ϴ� ���� (���Ǵ� �����ڰ� ����)
-- multi row 
--������ (in, not in) (any, all) >> ���� ������
--all : sal > 1000 and  sal > 2000 and ....
--any : sal > 1000 or sal > 2000 or ....

����(����)
1.subquery �� ��ȣ�ȿ� �־�� �Ѵ� -> (select sal from emp)
2.subquery �� ���� �÷����� ���� -> (select sal, deptno from emp) (X) �Ұ�
3.subquery �� �ܵ����� ���� �����ؾ� �Ѵ�

subquery �� ������ �ִ� sql����
1. subquery ���� ����
2. subquery �� ������� ������ main���� �����Ѵ�.

*/

--������̺��� jones �� �޿����� �� ���� �޿��� �޴� ����� ���, �̸�, �޿��� ���
select empno, ename, sal
from emp
where sal > (select sal from emp where ename = 'JONES');

--
select * from emp
where sal in(select sal from emp where sal > 2000);
--where sal = 2975 or sal = 2850 or sal = 2450 or ....

select * from emp
where sal not in(select sal from emp where sal > 2000);

--���������� �ִ� ����� ����� �̸��� ����ϼ���
select empno, ename
from emp
where mgr in(select mgr from emp)
order by empno;

select empno, ename
from emp where mgr is not null
order by empno;

select * from emp;
--���������� ���� ���

select empno, ename, mgr
from emp
where empno not in(select nvl(mgr, 0) from emp);

--king ���� �����ϴ� �� ���ӻ���� king �� ����� ���, �̸�, ����, ������ ����� ���
select empno, ename, job, mgr
from emp
where mgr in (select empno from emp where ename = 'KING');

--20�� �μ��� ����߿��� ���� ���� �޿��� �޴� ������� ������ �޿��� �޴� �����
--���, �̸�, �޿�, �μ���ȣ�� ����ϼ���
select empno, ename, sal, deptno
from emp
where sal > (select max(sal) from emp where deptno = 20);

--�����Լ��� subquery Ȱ��...
select *
from emp
where deptno in(select deptno from emp where job = 'SALESMAN')
and sal in(select sal from emp where job = 'SALESMAN');

--QUIZ
--�߱�
/*
�ڱ� �μ��� ��� ���޺��� �� ���� ������ �޴� ����� ���, �̸�, �μ���ȣ, �μ��� ��� �������
*/

select deptno, avg(sal) from emp group by deptno;
select empno, ename, e.deptno, e2."��տ���"
from emp e join (select deptno, avg(sal) as "��տ���" from emp group by deptno) e2
on e.deptno = e2.deptno
where e.sal > e2."��տ���";

--1. 'SMITH'���� ������ ���� �޴� ������� �̸��� ������ ����϶�.
select ename, sal
from emp
where sal > (select sal from emp where ename = 'SMITH');

SELECT ENAME, SAL
FROM EMP
WHERE SAL>(SELECT SAL
               FROM EMP
               WHERE ENAME='SMITH');
--2. 10�� �μ��� ������ ���� ������ �޴� ������� �̸�, ����,
-- �μ���ȣ�� ����϶�.
select ename, sal, deptno
from emp
where sal in(select sal from emp where deptno = 10);
 
 SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE SAL IN(SELECT SAL
                 FROM EMP
                 WHERE DEPTNO=10);
--3. 'BLAKE'�� ���� �μ��� �ִ� ������� �̸��� ������� �̴µ�
-- 'BLAKE'�� ���� ����϶�.
select ename, hiredate
from emp
where deptno = (select deptno from emp where ename = 'BLAKE')
      and ename != 'BLAKE';

SELECT ENAME, HIREDATE
FROM EMP
WHERE DEPTNO=(SELECT DEPTNO
                     FROM EMP
                     WHERE ENAME='BLAKE')
AND ENAME!='BLAKE';
--4. ��ձ޿����� ���� �޿��� �޴� ������� �����ȣ, �̸�, ������
-- ����ϵ�, ������ ���� ��� ������ ����϶�.
select empno, ename, sal
from emp
where sal > (select avg(sal) from emp)
order by sal desc;
 
 SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL>(SELECT  AVG(SAL)  FROM EMP)
ORDER BY SAL DESC;
 
--5. �̸��� 'T'�� �����ϰ� �ִ� ������ ���� �μ����� �ٹ��ϰ�
-- �ִ� ����� �����ȣ�� �̸��� ����϶�.
select empno, ename
from emp
where deptno in(select deptno from emp where ename like '%T%');

SELECT EMPNO, ENAME
FROM EMP
WHERE DEPTNO IN(SELECT DEPTNO
                       FROM EMP
                       WHERE ENAME LIKE '%T%');
--6. 30�� �μ��� �ִ� ����� �߿��� ���� ���� ������ �޴� �������
-- ���� ������ �޴� ������� �̸�, �μ���ȣ, ������ ����϶�.
--(��, ALL(and) �Ǵ� ANY(or) �����ڸ� ����� ��)
select ename, deptno, sal
from emp
where sal > all(select sal from emp where deptno = 30);
 
 SELECT ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL > (SELECT MAX(SAL)
                FROM EMP
                WHERE DEPTNO=30);
 
SELECT ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL > ALL(SELECT SAL
  FROM EMP
  WHERE DEPTNO=30);
--7. 'DALLAS'���� �ٹ��ϰ� �ִ� ����� ���� �μ����� ���ϴ� �����
-- �̸�, �μ���ȣ, ������ ����϶�.
select e.ename, e.deptno, e.job
from emp e join dept d on e.deptno = d.deptno
where d.LOC = 'DALLAS';

SELECT ENAME, DEPTNO, JOB
FROM EMP
WHERE DEPTNO IN(SELECT DEPTNO    -- = �� �´µ�  IN
                      FROM DEPT
                      WHERE LOC='DALLAS');
--8. SALES �μ����� ���ϴ� ������� �μ���ȣ, �̸�, ������ ����϶�.
select e.deptno, e.ename, e.job
from emp e join dept d on e.deptno = d.deptno
where d.dname = 'SALES';

SELECT DEPTNO, ENAME, JOB
FROM EMP
WHERE DEPTNO IN(SELECT DEPTNO
                      FROM DEPT
                      WHERE DNAME='SALES');
--9. 'KING'���� �����ϴ� ��� ����� �̸��� �޿��� ����϶�
--king �� ����� ��� (mgr �����Ͱ� king ���)
select e.ename, e.sal
from emp e left outer join emp e2 on e.mgr = e2.empno
where e2.ename = 'KING';

 SELECT ENAME, SAL
FROM EMP
WHERE MGR=(SELECT EMPNO
                FROM EMP
                WHERE ENAME='KING');
--10. �ڽ��� �޿��� ��� �޿����� ����, �̸��� 'S'�� ����
-- ����� ������ �μ����� �ٹ��ϴ� ��� ����� �����ȣ, �̸�,
-- �޿��� ����϶�.
select empno, ename, sal
from emp
where deptno in (select deptno from emp where ename like '%S%')
      and sal > (select avg(sal) from emp);

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > (SELECT AVG(SAL)
                FROM EMP)
AND DEPTNO IN(SELECT DEPTNO
                   FROM EMP
                   WHERE ENAME LIKE '%S%');
--11. Ŀ�̼��� �޴� ����� �μ���ȣ, ������ ���� �����
-- �̸�, ����, �μ���ȣ�� ����϶�.
select ename, sal, deptno
from emp
where deptno in (select deptno from emp where comm is not null)
and sal in (select sal from emp where comm is not null);

SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO IN(SELECT DEPTNO
                      FROM EMP
                      WHERE COMM IS NOT NULL)
AND SAL IN( SELECT SAL
               FROM EMP
               WHERE COMM IS NOT NULL);
--12. 30�� �μ� ������ ���ް� Ŀ�̼��� ���� ����
-- ������� �̸�, ����, Ŀ�̼��� ����϶�.
select ename, sal, comm
from emp
where sal not in (select sal from emp where deptno = 30)
    and  comm not in (select comm from emp where deptno =30 and comm is not null);

SELECT ENAME, SAL, COMM
FROM EMP
WHERE SAL NOT IN(SELECT SAL
                        FROM EMP
                        WHERE DEPTNO=30)
AND COMM NOT IN(SELECT NVL(COMM, 0)
                         FROM EMP
                         WHERE DEPTNO=30 and comm is not null);

-----------------------------------------------------------------

--[INSERT, UPDATE, DELETE]
/*
����Ŭ ����
DDL(������ ���Ǿ�) : create, alter, drop, truncate ( rename, modify )
DML(������ ���۾�) : insert, update, delete 
DQL(������ ���Ǿ�) : select
DCl(������ �����) : ���� ( grant , revoke )
TCl(Ʈ�����) : commit, rollback, savepoint --> ���� �����̰ų� ���� �̴�.
*/

--DML �۾�

--Ʈ����� (transaction) : �ϳ��� ������ �۾�����
--Ʈ��������� ó���Ǿ�� �ϴ� ����
--����������....(A��� ���¿��� ���� ��� B��� ���¿� ��ü)
--[A ��� ~~~~~~~~ B ��ü] �ϳ��� ���� : ��� -> ����, ����
--commit (A ~ B �� ���ܾ��� ����Ǹ�), rollback (A ~ B ������ ���ܰ� �߻��ϸ�)

/*
A��� ���� (100���� ���) : update ....
...
...
B��� ���� (100���� �Ա�) : update ....
*/

--���̺� �⺻ ����
desc emp;
--����Ŭ (system table(������ ����) ���ؼ� �پ��� ����)
select * from tab; --���� ������ ���� (bituser) �� �� �ִ� ���̺� ���

select * from tab where tname = 'BOARD'; --���̺���� ���� �� ������ Ȯ��

select * from col; --bituser ����ڰ� �����ϴ� ��� �÷� ����

select * from col where tname = 'EMP'; --Ư�� ���̺��� ������ �÷� ����

select * from user_tables; -- ������, Ʃ�� ����...
select * from user_tables where table_name = 'DEPT';
----------------------------------------------------------------------
--DML(����Ŭ.pdf > 168Page)
/*
INSERT INTO table_name [(column1[, column2, . . . . . ])]
VALUES (value1[, value2, . . . . . . ]);
*/

create table temp(
 id number primary key, --id �÷��� null(x), �ߺ�������(x), ������ ������ 1�Ǹ� ����
 name varchar2(20) -- default null ���
);

--1. ���� �Ϲ�����...
insert into temp(id, name)
values(100, 'ȫ�浿');

select * from temp;
--�ݿ�
commit;

--2. �÷� ����Ʈ ����(temp(id, name)) -> temp ���� -> ��� �÷��� ������ ���Խ�
insert into temp --�÷�����Ʈ ����
values(200, '������');

select * from temp;
commit;

--1. error
insert into temp(id, name)
values(100, '�ƹ���'); -- ���� �� ���� �̹� �⺻Ű�� id�� 100�̶�� �����Ͱ� ����ֱ� ������
--unique constraint (BITUSER.SYS_C007003) violated --> �⺻Ű(pk) ���� ����

--2. error
insert into temp(name)
values('�ƹ���'); --id�� �⺻Ű(pk)(�ߺ�(x), null(x))
--cannot insert NULL into ("BITUSER"."TEMP"."ID") --> �⺻Ű(pk) null(x)

-------------------------------------------------------------------------
--insert ������ �������
--�Ϲ� SQL �� ��� �����

--���^^
--pl-sql
create table temp2(id varchar2(20));

--begin
-- for i in 1..1000 loop
--  insert into temp2(id) values('A'||to_char(i));
-- end loop;
--end;

select * from temp2 order by id;
-------------------------------------------------------------------
create table temp3(
 memberid number(3) not null,
 name varchar2(10), --defual�� null ���
 regdate date default sysdate -- �⺻�� �����ϱ� (insert���� ������ �⺻������ ���� ��¥ ����)
);

alter session set nls_date_format='YYYY-MM-DD HH24:MI:SS';
select sysdate from dual;

insert into temp3(memberid, name, regdate)
values(100, 'ȫ�浿', '2018-03-02');

select * from temp3;

insert into temp3(memberid, name)
values(200, '�ƹ���'); --default �� ����(regdate �÷� >> sysdate ���� insert)

commit;

insert into temp3(memberid)
values(300);

commit;
-----------------------------------------------------------------------
--�ɼ� TIP)
--1.�뷮 ������ INSERT �ϱ�(1�� �̻�)
create table temp4(id number);
create table temp5(num number);

insert into temp4(id) values(1);
insert into temp4(id) values(2);
insert into temp4(id) values(3);
insert into temp4(id) values(4);
insert into temp4(id) values(5);
insert into temp4(id) values(6);
insert into temp4(id) values(7);
insert into temp4(id) values(8);
insert into temp4(id) values(9);
insert into temp4(id) values(10);
commit;

select * from temp4;

--�䱸���� : temp4 ���̺� �ִ� ��� �����͸� temp5�� �ְ� �;��.
--insert into ���̺�� (�÷�����Ʈ) select ���� (values ���� ��ſ�)
--��, �÷����� Ÿ���� ��ġ �Ѵٸ�...

insert into temp5(num)
select id from temp4;
--values

select * from temp5;
commit;

--2.Insert
--���̺��� ���� ��Ȳ���� [���̺��ڵ�����][�뷮 ������ ����]
--��, ���� ������ ���簡 �ȵǿ�(PK(�⺻Ű), FK(�ܷ�Ű) ... )

--emp ���̺�� ���� ������ ������ ���� �����͸� ���� �ǽ� ���̺�
create table copyemp
as select * from emp;

select * from copyemp;
--
create table copyemp2
as select empno, ename, job, sal from emp where deptno = 30;

select * from copyemp2;

--����) ����(Ʋ)�� �����ϰ�
--     �����ʹ� �����ϰ� ���� �ʾƿ�
create table copyemp3
as select * from emp where 1=2;
--select * from emp where 1=1; 1=1�� �׻� ��
--select * from emp where 1=2; 1=2�� �׻� ����

select * from copyemp3;
--���� ���� (����)
--�ý��� ���̺� ��� (���� ���� Ȯ���ϱ�)
select * from user_constraints where table_name = 'EMP';
select * from user_constraints where table_name = 'COPYEMP';

create table pktest(id number primary key);
insert into pktest(id) values(100);
commit;

create table pktest2
as select * from pktest;

select * from pktest;
select * from pktest2;

select * from user_constraints where table_name = 'TEMP';
select * from user_constraints where table_name = 'PKTEST'; --���������� ����
select * from user_constraints where table_name = 'PKTEST2'; --���������� ���簡 �ȵ�
-------------[INSERT END]-------------------------------------------------------

--[UPDATE]
/*
UPDATE table_name
SET column1 = value1 [,column2 = value2, . . . . . . .]
[WHERE condition];

UPDATE table_name
 SET (column1, column2, . . . . ) = ( SELECT column1,column2, . . .
                                      FROM table_name
                                      WHERE coundition)
[WHERE condition];
*/
commit;
select * from copyemp;

update copyemp
set sal = 0;

select * from copyemp;

rollback;

update copyemp
set job = 'NOT...'
where deptno = 20;

select * from copyemp order by deptno;
rollback;

--update (subquery ��� : ������ ����)
update copyemp
set sal = (select sum(sal) from copyemp);

select * from copyemp;
rollback;

update copyemp
set ename = 'AAAA', job = 'BBBB', hiredate = sysdate
where deptno = 10;

select * from copyemp where deptno = 10;

rollback;

------------------------------[UPDATE END]--------------------------------

delete from copyemp;

select * from copyemp;

rollback;

delete from copyemp where deptno = 20;

select * from copyemp where deptno=20;

rollback;

------------------------------[DELETE END]--------------------------------
/*
APP(JAVA) ---> JDBC API ---> ORACLE
CRUD�۾�
--Create : insert
--Read : select (��ü��ȸ, ������ȸ(row 1��))
--Update : update
--Delete : delete
(Create, Update, Delete) Ʈ������� ����(commit, rollback)

--��ü��ȸ, ������ȸ, ����, ����, ���� (������)
--�Լ� �ּ� 5��
public List<Emp> getEmpList(){ �ȿ� ������ select * from emp }
public Emp getEmpListByEmpno(int empno){ select * from emp where empno = ..}
public int inserEmp(Emp emp)(insert into emp values(...)}

�� �۾� : JDBC
*/
---------------------------------------------------------------------
--[DDL] create, alter, drop (������ ���̺�)
select * from user_tables where lower(table_name) = 'board';
select * from board;
drop table board;
create table board(
  boardid number,
  title varchar2(500),
  content varchar2(2000),
  regdate date
);

desc board;

--���� ��� �Ʒ� 2�� ���� ,,,,,,,,,,
--board ��� ���̺� �� �ֳ�?
select * from user_tables where lower(table_name) = 'board'; 
--board ��� ���̺� ���������� �ִ� Ÿ���� �ִ°�?
select * from user_constraints  where lower(table_name) = 'board'; 

--Oracle 11g �����÷�(���� �÷�)
--�л����� : ����, ����, ����, [����] �÷��� �־��
--����, ����, ���� �����͸� insert �Ǹ� (���� + ���� + ����)

create table vtable(
 no1 number,
 no2 number,
 no3 number GENERATED ALWAYS as (no1 + no2) VIRTUAL
);

insert into vtable(no1, no2) values(100, 50);
insert into vtable(no1, no2) values(80, 60);

select * from vtable;

--no3 �÷��� ������ ���� ���� �� ���� ���
insert into vtable(no1, no2, no3) values(80, 60, 200); --�Ұ� ERROR
--���� ���̺��� ���� �Է� �Ұ�!!!!!!

select COLUMN_NAME, DATA_TYPE, DATA_DEFAULT
from user_tab_columns where table_name = 'VTABLE';

--�ǹ��� ���Ǵ� ������ �ڵ�
--��ǰ���� (�԰���) �������� �бⵥ���� (4�б�)
--�԰��� : 2018-03-02 --> 1�б�

create table vtable2(
  no number, --����
  p_code char(4), --��ǰ�ڵ�(A001, B002...)
  p_date char(8), --�԰���(20180202)
  p_qty number, --����
  p_bungi number(1) --�����÷�
          GENERATED ALWAYS as (
            CASE WHEN substr(p_date,5,2) in ('01','02','03') THEN 1
                 WHEN substr(p_date,5,2) in ('04','05','06') THEN 2
                 WHEN substr(p_date,5,2) in ('07','08','09') THEN 3
                 ELSE 4
            END
          ) VIRTUAL
);

insert into vtable2(p_date) values('20180102');
insert into vtable2(p_date) values('20180126');
insert into vtable2(p_date) values('20180403');
insert into vtable2(p_date) values('20181101');
insert into vtable2(p_date) values('20181201');
commit;

select * from vtable2;

-------------------------------------------------------------
--DDL ���̺� �ٷ��...(��������)....
--����Ŭ.pdf(140Page)

--1.���̺� �����ϱ�
create table temp6(id number);

--2.���̺� �����ߴµ� �÷� �߰��ϱ�
--���� ���̺� �÷� �߰��ϱ�
desc temp6;

alter table temp6
add ename varchar2(20);

desc temp6;

--3.���� ���̺� �ִ� �÷��� �̸� �߸�ǥ��(ename -> username)
--���� ���̺� �ִ� �÷��� �̸� �ٲٱ� (rename)
alter table temp6
rename column ename to username;

desc temp6;

--4.���� ���̺� �ִ� �÷��� Type ����
--(modify)
alter table temp6
modify(username varchar2(200));

desc temp6;

--5.���� ���̺� �ִ� ���� �÷� �����ϱ�
alter table temp6
drop column username;

desc temp6;

--6.���̺� ������ ���� : delete
--���̺� ó�� ����� ó�� ũ�� -> ������ ������ -> ������ ũ��
--ex) ó�� ũ�� 1M -> 10���� -> ũ��+100M = 101M -> 10���� delete -> ũ�� 101M
--���̺� ������ ����, ������ ũ�⸦ ���� ��������?
--truncate(where ���� ��� X)
--ex) ó�� ũ�� 1M -> 10���� -> ũ��+100M = 101M -> truncate -> ���� ���̺� ũ�� 1M

drop table temp6;

desc temp;

------------------------------------------------------------------
--[���̺� ���� �����ϱ�]
--����Ŭ.pdf(144)
--�����ͺ��̽� ���Ἲ Ȯ��
--���� ( constraint ) : insert, update �ַ� ����

/*
*NOT NULL(NN) : ���� NULL ���� ������ �� �����ϴ�.

*UNIQUE key(UK) : ���̺��� ��� ���� [�����ϰ� �ϴ� ��]�� ���� ��(NULL�� ���)
  unique ������ null ���� ���� �� �ִ� -> null ���� ���ϰ� �Ϸ��� (not null�� ���� �������)

*PRIMARY KEY(PK) �����ϰ� ���̺��� ������ �ĺ�(NOT NULL �� UNIQUE ������ ����)
  not null �ϰ� unique �� ���� ( ���������� index �� �ڵ� ���� )
  index => �˻��� �ӵ��� ���� ��Ŵ( å �� ������ (�ܾ� + ?page) �����ϸ� �� )
  
*FOREIGN KEY(FK) ���� ������ �� ������ �ܷ�Ű ���踦 �����ϰ� �����մϴ�.
  (��������) [���̺�]�� [���̺�]���� ���輳��
  
*CHECK(CK) ���̾�� �ϴ� ������ ������(��κ� ���� ��Ģ�� ����)
  ������ ���� ���� ���� �Է¹ްڴ� (gender : �÷��� '��' �Ǵ� '��' ��� �����͸� �Է�)
  ex) where gender in ('��', '��')

������ ����� ����
1.���̺� ����鼭 �ٷ� ���� (create table ....)
2.���̺� ���� ���� (alter table ... add constraint....) -> �ڵ� ���� ��

*/

select * from user_constraints where table_name = 'EMP';
--------------------------------------------------------------------------------
create table temp7(
  --����ǥ��
  --id number primary key, �������� ���� -> ������ �̸��� �ڵ���� -> SYS_C006997(�����̸�)
  id number constraint pk_temp7_id primary key, --�������� ǥ�� : pk_���̺��_�÷���
  name varchar2(20) not null,
  addr varchar2(50)
);

select * from user_constraints where table_name = 'TEMP7';

insert into temp7(name,addr) values('ȫ�浿', '����� ������'); -- id = pk(unique, not null)

insert into temp7(id,name,addr) values(10, 'ȫ�浿', '����� ������');  --����

insert into temp7(id,name,addr) values(10, '������', '����� ������');  --�ߺ�Ű �� error

select * from temp7;

commit;

create table temp8(
  id number constraint pk_temp8_id primary key, --PK�� ���̺� �� �Ѱ� (�ߺ�Ű ���� :  ��� �ϳ�)
  name varchar2(20) not null,
  jumin char(6) constraint uk_temp8_jumin unique, -- null���
  --jumin char(6) not null constraint uk_temp8_jumin unique -- not null�ϰ� unique�� ����
  addr varchar2(20)
);

select * from user_constraints where table_name = 'TEMP8';

insert into temp8(id, name, jumin, addr)
values(10, 'ȫ�浿', '123456', '��⵵');

commit;

select * from temp8;
insert into temp8(id,name,jumin,addr)
values(100,'������', '123456','��⵵'); --jumin�� ����ũ �� ��
--unique constraint (BITUSER.UK_TEMP8_JUMIN) violated

insert into temp8(id,name,jumin) values(200, '�ƹ���', '123456'); --�����߻�

---------------------------------------------------------------------
--���̺� ���� �Ŀ� ���� �ɱ�
create table temp9 (id number);

--���� ���̺� ���� �߰��ϱ�
--����) �Էµ� �����Ͱ� �ִٸ� >> 10, 10 �ΰ� >> pk ����(x) >> ������ ���� >> ����
alter table temp9
add constraint pk_temp9_id primary key(id);

select * from user_constraints where table_name = 'TEMP9';

select * from  temp9;

alter table temp9
add ename varchar2(20);

--���̺� �⺻ ����
desc temp9;

--���̺� ���� ����
select * from user_constraints where table_name = 'TEMP9';

--not null ���� �߰�
alter table temp9
modify(ename not null);

desc temp9;
---------------------------------------------------------------
--[check]
--where ���� �� ������ ���� >> where gender in ('��', '��');
create table temp10(
  id number constraint pk_temp10_id primary key, --pk�� ���̺�� 1��(��� 1��)
  name varchar2(20) not null, --�ʼ� �Է�
  jumin char(6) constraint uk_temp10_jumin unique, -- ����ũ�� �� (�ʿ��ϴٸ� not null �߰� ����)
  addr varchar2(20), --�߰��Է�(�����Է�)
  age number constraint ck_temp10_age check(age >= 19) -- where gender in ('��', '��');
);

--���̺� �⺻ ����
desc temp10;
--���̺� ���� ����
select * from user_constraints where table_name = 'TEMP10';

insert into temp10(id,name,jumin,addr,age)
values(100, 'ȫ�浿', '123456', '����� ������', 25);

select * from temp10;

insert into temp10(id,name,jumin,addr,age)
values(200, 'ȫ�浿', '123457', '����� ������', 25);

insert into temp10(id,name,jumin,addr,age)
values(300, 'ȫ�浿', '123458', '����� ������', 18); --check(x) 19�̻� �̿��� ��

commit;

select * from temp10;

---------------------------------------------------------------
--[���� ����] >> ���̺�� ���̺� ���� ��� >> ���� (RDB)

create table c_emp
as
  select empno, ename, deptno from emp where 1=2;
  
create table c_dept
as
  select deptno, dname from dept where 1=2;
  
select * from c_emp;
select * from c_dept;

--����Ű(c_emp (deptno) fk -> c_dept(deptno) �÷��� ���� �ϵ���...
--������ ���ҷ��� (������ ���� �� ����) >> �ſ� >> �ּ��� unique �Ǵ� primary keyȮ��
--2�� ����)
alter table c_emp
add constraint fk_emp_deptno foreign key(deptno) references c_dept(deptno);

--���� c_dept (deptno) pk �ɰ�
--�׸��� c_emp (deptno) ����
--1�� ����)
alter table c_dept
add constraint pk_dept_deptno primary key(deptno);

insert into c_dept(deptno, dname) values(100, '�λ���');
insert into c_dept(deptno, dname) values(200, '������');
insert into c_dept(deptno, dname) values(300, 'ȸ����');
commit;

select * from c_dept;
select * from c_emp;

--��� �Ի�
insert into c_emp(empno, ename)
values(100, 'ȫ�浿');--fk (not null ���� x) null �� ����

select * from c_emp;

insert into c_emp(empno, ename, deptno)
values(200, '������', 500); -- fk���� ����(�μ��� 100, 200, 300) ���µ� 500 ����

insert into c_emp(empno, ename, deptno)
values(200, '������', 300);

select * from c_emp;
select * from c_dept;
-- deptno ��� ���迡�� (c_dept(�θ�:master) - c_emp(�ڽ�:detail))
commit;

delete from c_dept where deptno = 300;--(x) c_emp�� �����Ϳ��� deptno 300�� �� ���� �ϰ� �־
delete from c_dept where deptno = 200;--(o) deptno 200�� �����ϰ� �ִ� ���� ���� ������ ����
--300�� ���� >> �����ϰ� �ִ� �� (c_emp ���� �����ϰ�) >> c_dept >> 300�μ� ����
-------------------------------------------------------------------------
--����Ŭ.pdf
/*
column datatype [CONSTRAINT constraint_name]
REFERENCES table_ name (column1[,column2,..] [ON DELETE CASCADE])
column datatype,
. . . . . . . ,
[CONSTRAINT constraint_name] FOREIGN KEY (column1[,column2,..])
REFERENCES table_name (column1[,column2,..] [ON DELETE CASCADE])
*/
--[ON DELETE CASCADE] �θ����̺�� ������ ���� �ϰڴ�.
--300 ���� �� �ֳ���
--delete from c_dept where detpno = 300;
--�����ϴ� �ڽ� ������ ���� ����
--delete from c_emp where deptno = 300; ���� ����
alter table c_emp
add constraint fk_emp_deptno foreign key(deptno) references c_dept(deptno) on delete cascade;

-----------------------------------------------------------------
--alter table c_emp
--modify deptno from emp where deptno = 300;

-----------------------------------------------------------------
--�л� ���� ���̺�
--�й��� �����ʹ� �ߺ��ǰų� NULL ���� ����ϸ� �ȵȴ�
--�̸� NULL ���� ������� �ʴ´�
--����
--����
--���� ���� �÷��� ���� Ÿ���̰� NULL ���� ���
--�� ���� �Է����� ������  default�� 0���� ���´�
--���� ,��� �÷��� �����÷�����(�����÷�) �����Ѵ�
--�а��ڵ�� �а� ���̺� �а��ڵ带 �����Ѵ�
--�й� , �̸� , ���� , ���� , ���� , ���� , ��� , �а��ڵ�

--�а� ���̺�
--�а��ڵ� �����ʹ� �ߺ��ǰų� NULL ���� ����ϸ� �ȵȴ�,
--�а��� �� null���� ������� �ʴ´�

--�а��ڵ� , �а���

--�׸��� select �����
--�й� , �̸�  ����, ��� , �а��ڵ� , �а��� �� ����ϼ���

--�л� �������̺�
create table s_grade(
  sno number constraint pk_s_grade_sno primary key,
  sname varchar2(20) not null,
  korean number default 0,
  english number default 0,
  math number default 0,
  score number GENERATED ALWAYS as (korean + english + math) virtual,
  avg number GENERATED ALWAYS as ((korean + english + math)/3) virtual,
  deptno number
);

--�а� ���̺�
create table department(
  deptno number constraint pk_department_deptno primary key,
  dname varchar2(20) not null
);

--�л��������̺� >> �а����̺� ����
alter table s_grade
add constraint fk_s_grade_deptno foreign key(deptno) references department(deptno);

--�а� �ֱ�
insert into department values(100, '��ǻ�Ͱ��а�');
insert into department values(200, '������Ű�');
--�л� ���� �ֱ�
insert into s_grade(sno, sname, korean, english, math, deptno)
values(41425017, '������', 10, 20, 30, 100);

select * from s_grade;
select * from department;

--�ٸ���� fk�� m_code ������ ���ٷ� �� �� ����.
create table grade(
  s_number number ,
  s_name varchar2(20) not null,
  k_score number default 0,
  e_score number default 0,
  m_score number default 0,
  m_code number,
  avg_score number GENERATED always as (round((k_score + e_score + m_score)/3,2)) VIRTUAL,
  sum_score number GENERATED always as (k_score + e_score + m_score) VIRTUAL,
  
  constraint pk_grade_snum primary key(s_number),
  constraint fk_grade_mcode foreign key(m_code) references major(m_code)
);
 
create table major(
  m_code number,
  m_name varchar2(20) not null,
  constraint pk_major_mcode primary key(m_code)
);

------------------------------------------------------------------------
--view(�������̺�) ����Ŭ.pdf(192Page)
--���� ���̺�
--view ��ü( create ... )
--create view ���̸� as [view��_����_��� (select ����)]
--view �� ���̺�ó�� ��� ���� (���� ���̺�) -> ���� emp, dept ���� �������� ���̺��� �ƴϴ�.
--view �� �޸𸮻󿡸� �����ϴ� ���� ���̺� (subquery -> in line view -> from (select..)
--view �� sql���� ���

--view ���� ���̺�
--���� : �Ϲ� ���̺�� ������ ���� from �� where...
--DML( insert , update , delete ) - View �� ���ؼ� DML ���� -> ���� view�� ���� �� �� �ִ� �������̺� ������ ����

--view ���
--�������� ���� (join, subquery) ���� ���� ��� (���� ���̺�)
--������ ���� �ܼ�ȭ
--���� (���� ���� ó��) -> �����ϰ� ���� �����͸� ��Ƽ� view ���� -> ����

create view v_001
as
  select empno, ename from emp;
  
select * from v_001;
select * from v_001 where empno=7788;

create view v_002
as
  select e.empno, e.ename, e.deptno, d.dname
  from emp e join dept d
  on e.deptno = d.deptno; -- ������ ������ �ܼ�ȭ �� �� �ִ�.

select * from v_002;

create view v_003
as
  select deptno, avg(sal) as avgsal
  from emp
  group by deptno;

select * from v_003;
select *
from emp e join  v_003 s
on e.deptno = s.deptno
where e.sal > s.avgsal;

--���� ���ϴ� �����Ͱ� ���̺�� �����Ѵٸ�
--join �ϱ� �����ٵ� >> in line view , view

/*
CREATE [OR REPLACE] [FORCE | NOFORCE] VIEW view_name [(alias[,alias,...])]
AS Subquery
[WITH CHECK OPTION [CONSTRAINT constraint ]]
[WITH READ ONLY]

OR REPLACE �̹� �����Ѵٸ� �ٽ� �����Ѵ�.
FORCE Base Table ������ ������� VIEW �� �����.
NOFORCE �⺻ ���̺��� ������ ��쿡�� VIEW �� �����Ѵ�.
view_name VIEW �� �̸�
Alias Subquery �� ���� ���õ� ���� ���� Column ���� �ȴ�.
Subquery SELECT ������ ����Ѵ�.
WITH CHECK OPTION VIEW �� ���� �׼��� �� �� �ִ� �ุ�� �Է�,���ŵ� �� �ִ�.
Constraint CHECK OPTON ���� ���ǿ� ���� ������ �̸��̴�.
WITH READ ONLY �� VIEW ���� DML �� ����� �� ���� �Ѵ�.
*/
/*
--1.create or replace v_007 as ����...(����, overwirte)
--view �� �÷����� �ʿ��ϴ� as ""
*/


create or replace view v_emp
as
  select empno, ename, deptno from emp where deptno = 20;

select * from v_emp;
select * from v_emp where deptno = 10; -- �� �� ����

--view ���� ���̺� >> DML(insert, update, delete ....)
--view [����] �ٶ� �� �ִ� �����Ϳ� ���ؼ� DML ����
--���� ���̺� (DML) >> view�� ���ؼ�...

delete from v_emp;--deptno��ȣ�� 20�� �����

select * from emp;--�����δ� emp ���̺� >> deptno��ȣ�� 20���� ��� ����
select empno, ename, deptno from emp where deptno = 20;
rollback;

----------------------------------------------------------------------

--1. 30�� �μ� ������� ����, �̸�, ������ ��� VIEW�� ������.
create view v_004
as
  select job, ename, sal from emp where deptno = 30;

select * from v_004;
 
--2. 30�� �μ� �������  ����, �̸�, ������ ��� VIEW�� ����µ�,
-- ������ �÷����� ����, ����̸�, �������� ALIAS�� �ְ� ������
-- 300���� ���� ����鸸 �����ϵ��� �϶�.
-- create or replace view view001 (�÷���, �÷���, .....)  
create view v_005 (����, ����̸�, ����)
as 
  select job, ename, sal
  from emp where sal > 300;
  
select * from v_005;
 
--3. �μ��� �ִ����, �ּҿ���, ��տ����� ��� VIEW�� ������.
create view v_006(�μ���ȣ, �ִ����, �ּҿ���, ��տ���)
as
  select deptno, max(sal), min(sal), avg(sal)
  from emp group by deptno;

select * from v_006;
       
--4. �μ��� ��տ����� ��� VIEW�� �����, ��տ����� 2000 �̻���
-- �μ��� ����ϵ��� �϶�.
create view v_007(�μ���ȣ, ��տ���)
as
  select deptno, avg(sal)
  from emp group by deptno having avg(sal) >= 2000;
 
select * from v_007;
 
--5. ������ �ѿ����� ��� VIEW�� �����, ������ MANAGER��
-- ������� �����ϰ� �ѿ����� 3000�̻��� ������ ����ϵ��� �϶�.
create view v_008(����, �ѿ���)
as
  select job, sum(sal)
  from emp group by job
  having job != 'MANAGER' and sum(sal) >= 3000;

select * from v_008;

--------------------------------------------------------------------------------

create view v_009
as
  select d.dname, e.deptno, e.��տ���
  from (select deptno, avg(sal) as ��տ��� 
        from emp group by deptno 
        having avg(sal) >= 2000) e join dept d
        on e.deptno = d.deptno;

select * from v_009;

select d.dname, e.deptno, avg(e.sal) as ��տ���
from emp e join dept d on e.deptno = d.deptno
group by e.deptno 
having avg(e.sal) >= 2000;

--------------------------------------------------------------------------------
/*
����Ŭ.pdf  185Page

������ ��ü 
���� ���� (ä����)
�ڵ����� ��ȣ�� �����ϴ� ��ü

CREATE  SEQUENCE  sequence_name  
[INCREMENT  BY  n]  
[START  WITH  n]  
[{MAXVALUE n | NOMAXVALUE}]  
[{MINVALUE n | NOMINVALUE}]  
[{CYCLE | NOCYCLE}]  
[{CACHE | NOCACHE}];

sequence_name  SEQUENCE �� �̸��Դϴ�. 
INCREMENT  BY  n ���� ���� n ���� SEQUENCE ��ȣ ������ ������ ����. 
�� ���� �����Ǹ� SEQUENCE �� 1 �� ����. 
START  WITH  n  �����ϱ� ���� ù��° SEQUENCE �� ����. 
�� ���� �����Ǹ� SEQUENCE �� 1 �� ����. 
MAXVALUE n  SEQUENCE �� ������ �� �ִ� �ִ� ���� ����. 
NOMAXVALUE   ���������� 10^27 �ִ밪�� ����������-1 �� �ּҰ��� ����. 
MINVALUE n  �ּ� SEQUENCE ���� ����. 
NOMINVALUE  ���������� 1 �� ����������-(10^26)�� �ּҰ��� ����. 
CYCLE | NOCYCLE  �ִ� �Ǵ� �ּҰ��� ������ �Ŀ� ��� ���� ������ ���� ���θ� 
    ����. NOCYCLE �� ����Ʈ. 
CACHE | NOCACHE  �󸶳� ���� ���� �޸𸮿� ����Ŭ ������ �̸� �Ҵ��ϰ� ���� 
    �ϴ°��� ����. ����Ʈ�� ����Ŭ ������ 20 �� CACHE.  

*/

--�Խ���
/*
create table board(
  boardid number primary key,
  title varchar2(50)......
);
boardid >> �ߺ���, null ���� (x)
������ : �����͸� insert �� �� �ߺ����� �ƴ϶�� �Ϳ� ���� ����...

where boardid = 10; �ϳ��� row �� return �ϴ� ���� ����

�Խ��� �۾���
insert into board (...) values(, 'ȫ�浿','�氡�氡')

*/

create table kboard(
  num number constraint pk_kboard_num primary key,
  title varchar2(50)
);

--ó�� ���� ���� 1 �̶�� ���� , �� ���� ���� ���� ���� 2, 3, 4 ... �������� ��

--ó�� �� >> 1
insert into kboard(num, title)
values((select nvl(max(num), 0)+1 from kboard), 'ó��');
--���� �� ���� >> 2, 3, 4 ...
insert into kboard(num, title)
values((select nvl(max(num), 0)+1 from kboard), '�ι�°');

insert into kboard(num, title)
values((select nvl(max(num), 0)+1 from kboard), '����°');

commit;

select * from kboard;

delete from kboard where num=1;

insert into kboard(num, title)
values((select nvl(max(num), 0)+1 from kboard), '�׹�°');

----------------------------------------------------------------------------
--��ȣ�� ���� �ߺ����� �ȳ����� �������� ��
----------------------------------------------------------------------------
--sequence ��ü
create sequence board_num;

select * from user_sequences;
/*
1.4.1 NEXTVAL �� CURRVAL �ǻ翭 
��) Ư¡ 
1) NEXTVAL �� ���� ��� ������ SEQUENCE ���� ��ȯ �Ѵ�. 
2) SEQUENCE �� ������ �� ����, �ٸ� ����ڿ��� ������ ������ ���� ��ȯ�Ѵ�. 
3) CURRVAL �� ���� SEQUENCE ���� ��´�. 
4) CURRVAL �� �����Ǳ� ���� NEXTVAL �� ���Ǿ�� �Ѵ�. 
*/
--��ä��
select board_num.nextval from dual;

--���簪...(ä�� ���� �ʰ� ������)
select board_num.currval from dual;

create table tboard(
  num number constraint pk_tboard_num primary key,
  title varchar2(50)
);

create sequence tboard_num;

insert into tboard(num, title) values(tboard_num.nextval, '�۾���');

select tboard_num.currval from dual; -- nextval �� �ѹ��� ���� �ʾұ� ������ ����

select * from tboard;

delete from tboard where num = 5;

insert into tboard(num, title) values(tboard_num.nextval, '5�� ���� �� ����');

commit;

--sequence �� rollback �Ǵ� �ڿ��� �ƴϴ�!!!

--�Խ���(10��)
--��ǰ �Խ���, ������ �Խ���, ȸ���Խ��� .....
--���̺� 10�� ������ sequence ��ü �ϳ��� ����ص� �ȴ�...
--TIP
--ms-sql : create table board(boardnum int identity(1,1) , title varchar(20))
--         insert into board(title) values('����')
--2012���� ���� : ����Ŭ ó�� sequence �� ��� ����

--my-sql : create table board(boardnum int auto_increment , title varchar(20))
--         insert into board(title) values('����')

create sequence seq_num
start with 10
increment by 2;

select seq_num.nextval from dual;
select * from user_sequences;

--����Ŭ sequence
--100�� insert -> sequence -> 100�� ä�� -> 50�� ä�� -> insert�ϸ� 101�� ����
--1,2,3,4,5,6......50,101 > 51��

--��ȸ (�Խ���)
--�ֽű��� ���� ... ���߿� �� ���� ����
--�۹�ȣ (����)

--�ֽű� ������ ���� �ּ���
--select * from board order by boardunm desc;
--     (ȭ�����)
--101   --51
--50    --50
--49    --49
--48    --48
--...
-----------------------------------------------------------------
--������ (sequence , rownum)
--rownum �ǻ� �÷� : ���� ���������� �����ϴ� �÷��� �ƴϰ� ������ ����

--rownum : ������ ���̺� �������� �ʴ� �÷�(�� ��ȣ �ο�)
--rowid : �ּҰ�(���� ������ ����Ǵ� ���� �ּҰ�) -> �ε��� ����� ���� ���...

select empno, ename from emp;

select rownum as ����, empno from emp;

--Top-n ����
--���̺��� ���ǿ� �´� ���� (TOP) ���ڵ忡 n�� ���� ...
--�ٰ� : ���� (����)

--ms-sql : select top 10 --> select top 10, * from emp order by sal desc

--oracle : rownum(�ǻ��÷�) : ������ �ʿ��ϴ�

--1.���� ������ �����
--2.������ ������ �ο��ϰ� ������ ����

--1�ܰ� ��������
select e.*
from (
      select * from emp order by sal desc
     ) e;

--2�ܰ�
select rownum, e.*
from (
      select * from emp order by sal desc
     ) e
where rownum <= 10;

-------------------------------
--!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
select rownum as "����", e.* --select �� ����� ������ ���̴� ��
from (
      select * from emp order by sal desc
     ) e
where "����" < 5; --�Ұ�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
--!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
select e.* --select �� ����� ������ ���̴� ��
from (
      select * from emp order by sal desc
     ) e
where rownum < 5; --�������� ó�� ���� ������ ũ�ٴ� ǥ�� (row num �ٽ� ����)
-------------------------------
--10 ���� ū ��ȣ ���
select * 
from 
(
  select  rownum as n ,e.*
  from (
        select *
        from emp order by sal desc
       ) e
) a 
where  n  > 10; 

------------------------------------------------------------------------
--�Խ���(����¡ ó�� ����)
--100���� ������(row)

--�� 100�� 
--pagesize (ms-sql : page, oracle : bolock?(����))
--pagesize = 10 ���� (ȭ�� �� �������� �� �� �ִ� ������ �Ǽ� 10��)
--�Ǽ� / pagesize -> �������� ���� -> 10�� -- 104���̶�� => 11��
--pagecount => 10��

--1~100
/*
  1~10    11~20   ...   91~100
  1page   2page   ...   10page
*/

------------------------------------------------------------------------

--HR ��������
select * from employees;

select *
from (
      select rownum as num, e.*
      from (
            select * from employees order by employee_id asc
           ) e
      where rownum <= 10
     ) e2
where e2.num > 0;

--1 ~ 10, 11 ~ 20, 21 ~ 30, 31 ~ 40, 41 ~ 50
--                                   5�� page

--between A and B -> where e2.num between 0 and 10;
select *
from (
      select rownum as num, e.*
      from (
            select * from employees order by employee_id asc
           ) e
      --where rownum <= 10
     ) e2
where e2.num between 0 and 10;
-------------------------------------------------------------------
--SQL 1 �� �н�  END
-------------------------------------------------------------------

--SQL 2�� �н� (3�� ������Ʈ ��)
--������� (����)
--PL-SQL 
--���� , ��� , Ŀ�� , �Լ� , ���ν��� , Ʈ���� , ������

-------------------------------------------------------------------

--1> �μ����̺��� ��� �����͸� ����϶�.
select * from dept;
 
--2> EMP���̺��� �� ����� ����, �����ȣ, �̸�, �Ի����� ����϶�.
select job, empno, ename, hiredate from emp;
 
--3> EMP���̺��� ������ ����ϵ�, �� �׸�(ROW)�� �ߺ����� �ʰ�
-- ����϶�.
 
 
--4> �޿��� 2850 �̻��� ����� �̸� �� �޿��� ����϶�.
select ename, sal from emp where sal >= 2850;
 
--5> �����ȣ�� 7566�� ����� �̸� �� �μ���ȣ�� ����϶�.
 
 
--6> �޿��� 1500�̻� ~ 2850������ ������ ������ �ʴ� ��� ����� �̸�
-- �� �޿��� ����϶�.
select ename, sal from emp where not(sal >= 1500 and sal <= 2850);
 
--7> 1981�� 2�� 20�� ~ 1981�� 5�� 1�Ͽ� �Ի��� ����� �̸�,���� �� 
--�Ի����� ����϶�. �Ի����� �������� �ؼ� ������������ �����϶�.
 
 
--8> 10�� �� 30�� �μ��� ���ϴ� ��� ����� �̸��� �μ� ��ȣ��
-- ����ϵ�, �̸��� ���ĺ������� �����Ͽ� ����϶�.
select ename, deptno from emp where deptno in(10,30) order by ename asc;

--9> 10�� �� 30�� �μ��� ���ϴ� ��� ��� �� �޿��� 1500�� �Ѵ�
-- ����� �̸� �� �޿��� ����϶�.
--(�� �÷����� ���� employee �� Monthly Salary�� �����Ͻÿ�)
 
--10> �����ڰ� ���� ��� ����� �̸� �� ������ ����϶�.
 select ename, job from emp where mgr is null;
 
--11> Ŀ�̼��� �޴� ��� ����� �̸�, �޿� �� Ŀ�̼��� ����ϵ�, 
-- �޿��� �������� ������������ �����Ͽ� ����϶�.
 
 
--12> �̸��� �� ��° ���ڰ� A�� ��� ����� �̸��� ����϶�.
 select ename from emp where substr(ename, 3, 1) = 'A';
 --- �ٸ� ���
 select ename from emp where ename like('__A%');
 
--13> �̸��� L�� �� �� ���� �μ� 30�� �����ִ� ����� �̸��� 
--����϶�.
 
 
--14> ������ Clerk �Ǵ� Analyst �̸鼭 �޿��� 1000,3000,5000 �� 
-- �ƴ� ��� ����� �̸�, ���� �� �޿��� ����϶�.
 select ename, job, sal from emp 
 where job not in('CLERK', 'ANALYST') and sal not in(1000, 2000, 5000);
 
--15> �����ȣ, �̸�, �޿� �׸��� 15%�λ�� �޿��� ������ ǥ���ϵ� 
--�÷����� New Salary�� �����Ͽ� ����϶�.
 
 
--16> 15�� ������ ������ ����Ÿ���� �޿� �λ��(�� �޿����� ���� 
-- �޿��� �� ��)�� �߰��ؼ� ����϶�.(�÷����� Increase�� �϶�). 
 select empno, ename, sal, trunc(sal+(sal*0.15),0)-sal as �λ�޿�
 from emp;
 
 
--18> ��� ����� �̸�(ù ���ڴ� 
-- �빮�ڷ�, ������ ���ڴ� �ҹ��ڷ� ǥ��) �� �̸� ���̸� ǥ���ϴ�
-- ������ �ۼ��ϰ� �÷� ��Ī�� ������ �־ ����϶�.
 select initcap(lower(ename))as�̸�, length(ename)as���� from emp;
 
--19> ����� �̸��� Ŀ�̼��� ����ϵ�, Ŀ�̼��� å������ ���� 
-- ����� Ŀ�̼��� 'no commission'���� ����϶�.
 
 
--20> ��� ����� �̸�,�μ���ȣ,�μ��̸��� ǥ���ϴ� ���Ǹ� �ۼ��϶�.
 select e.ename, e.deptno, d.dname
 from emp e join dept d on e.deptno = d.deptno;
 
--21> 30�� �μ��� ���� ����� �̸��� �μ���ȣ �׸��� �μ��̸��� ����϶�.
 
 
--22> 30�� �μ��� ���� ������� ��� ������ �μ���ġ�� ����϶�.
--(��, ���� ����� �ߺ����� �ʰ� �϶�.)
 select distinct e.job, d.loc 
 from emp e join dept d on e.deptno = d.deptno
 where e.deptno = 30;
 
--23> Ŀ�̼��� å���Ǿ� �ִ� ��� ����� �̸�, �μ��̸� �� ��ġ�� ����϶�.
 
 
--24> �̸��� A�� ���� ��� ����� �̸��� �μ� �̸��� ����϶�.
 select e.ename, d.dname
 from emp e join dept d on e.deptno = d.deptno
 where e.ename like('%A%');
 
--25> Dallas���� �ٹ��ϴ� ��� ����� �̸�, ����, �μ���ȣ �� �μ��̸��� 
-- ����϶�.
 
 
--26> ����̸� �� �����ȣ, �ش� �������̸� �� ������ ��ȣ�� ����ϵ�,
-- �� �÷����� employee,emp#,manager,mgr#���� ǥ���Ͽ� ����϶�.
 select e.ename as employee, e.empno as emp#, e2.ename as manager, e.mgr as mgr#
 from emp e join emp e2 on e.mgr = e2.empno;
 
--27> ��� ����� �̸�,����,�μ��̸�,�޿� �� ����� ����϶�.
 
 
--28> Smith���� �ʰ� �Ի��� ����� �̸� �� �Ի����� ����϶�.
 select ename, hiredate
 from emp
 where hiredate > (select hiredate from emp where ename = 'SMITH');
 
--29> �ڽ��� �����ں��� ���� �Ի��� ��� ����� �̸�, �Ի���, 
-- �������� �̸�, �������� �Ի����� ����ϵ� ���� �÷����� 
-- Employee,EmpHiredate, Manager,MgrHiredate�� ǥ���Ͽ� 
-- ����϶�.
 
 
--30> ��� ����� �޿� �ְ��,������,�Ѿ� �� ��վ��� ����ϵ� 
-- �� �÷����� Maximum,Minimum,Sum,Average�� �����Ͽ� ����϶�.
 select max(sal) as Maximum, min(sal) as Minimum, sum(sal) as Sum, avg(sal) as Average
 from emp;
 
--31> �� �������� �޿� ������.�ְ��,�Ѿ� �� ��վ��� ����϶�.
 
--32> ������ ������ ��� ���� ������ ���� ����϶�.
 select count(job), job from emp group by job;
 
--33> �������� ���� ����ϵ�, ������ ��ȣ�� �ߺ����� �ʰ��϶�. 
-- �׸���, �÷����� Number of Manager�� �����Ͽ� ����϶�.
 
 
--34> �ְ� �޿��� ���� �޿��� ������ ����϶�.
 select max(sal)-min(sal) from emp;
 
--35> ������ ��ȣ �� �ش� �����ڿ� ���� ������� ���� �޿��� ����϶�.
-- ��, �����ڰ� ���� ��� �� ���� �޿��� 1000 �̸��� �׷��� ���ܽ�Ű�� 
-- �޿��� �������� ��� ����� ������������ �����϶�.
 select mgr, min(sal) from emp where mgr is not null
 group by mgr having min(sal) >= 1000 order by min(sal) desc; 
 
--36> �μ����� �μ��̸�, �μ���ġ, ��� �� �� ��� �޿��� ����϶�.
-- �׸��� ������ �÷����� �μ���,��ġ,����� ��,��ձ޿��� ǥ���϶�.
 select d.dname, d.loc, e.cnt, e.avgsal
 from dept d join (select count(*) as cnt, deptno, avg(sal) as avgsal from emp group by deptno) e 
 on e.deptno = d.deptno;
 
--37> Smith�� ������ �μ��� ���� ��� ����� �̸� �� �Ի����� ����϶�.
-- ��, Smith�� �����ϰ� ����Ͻÿ�
 
 
--38> �ڽ��� �޿��� ��� �޿����� ���� ��� ����� ��� ��ȣ, �̸�, �޿��� 
--    ǥ���ϴ� ���Ǹ� �ۼ��ϰ� �޿��� �������� ����� ������������ �����϶�.
 select empno, ename, sal
 from emp
 where sal > (select avg(sal) from emp)
 order by sal desc;
 
--39> �̸��� T�� ���� ����� ���� �μ����� �ٹ��ϴ� ��� ����� �����ȣ
-- �� �̸��� ����϶�.
 
 
--40> �μ���ġ�� Dallas�� ��� ����� �̸�,�μ���ȣ �� ������ ����϶�.
 select e.ename, e.deptno, job from emp e join dept d on e.deptno = d.deptno
 where d.loc = 'DALLAS';
 
--41> KING���� �����ϴ� ��� ����� �̸��� �޿��� ����϶�.
 
 
--42> Sales �μ��� ��� ����� ���� �μ���ȣ, �̸� �� ������ ����϶�.
 select e.deptno, e.ename job from emp e join dept d on e.deptno = d.deptno
 where d.dname = 'SALES';
 
--43> �ڽ��� �޿��� ��� �޿����� ���� �̸��� T�� ���� ����� ������
-- �μ��� �ٹ��ϴ� ��� ����� ��� ��ȣ, �̸� �� �޿��� ����϶�.
 
 
--44> Ŀ�̼��� �޴� ����� �޿��� ��ġ�ϴ� ����� �̸�,�μ���ȣ,�޿��� 
-- ����϶�.
 select ename, deptno, sal
 from emp where sal in(select sal from emp where comm is not null);
 
--45> Dallas���� �ٹ��ϴ� ����� ������ ��ġ�ϴ� ����� �̸�,�μ��̸�,
--     �� �޿��� ����Ͻÿ�
 
 
--46> Scott�� ������ �޿� �� Ŀ�̼��� �޴� ��� ����� �̸�, �Ի��� �� 
-- �޿��� ����Ͻÿ�
 select ename, hiredate, sal from emp 
 where sal = (select sal from emp where ename = 'SCOTT');
 
--47> ������ Clerk �� ����麸�� �� ���� �޿��� �޴� ����� �����ȣ,
-- �̸�, �޿��� ����ϵ�, ����� �޿��� ���� ������ �����϶�.
 
  
--48> �̸��� A�� ���� ����� ���� ������ ���� ����� �̸���
-- ����, �μ���ȣ�� ����϶�.
 select sal, deptno from emp
 where job in(select job from emp where ename like('%A%'));
 
--49> New  York ���� �ٹ��ϴ� ����� �޿� �� Ŀ�̼��� ���� ����� 
-- ����̸��� �μ����� ����϶�.

 
 
--50> Dallas���� �ٹ��ϴ� ����� ���� �� �����ڰ� ���� ����� �����ȣ,����̸�,
--    ����,����,�μ���,Ŀ�̼��� ����ϵ� Ŀ�̼��� å������ ���� ����� NoCommission
--    ���� ǥ���ϰ�, Ŀ�̼��� �÷����� Comm���� ������ ����Ͻÿ�.
--    ��, �ְ���޺��� ��µǰ� �Ͻÿ�
 select e.empno, e.ename, e.job, e.sal, d.dname, nvl(to_char(e.comm), 'NoCommission') as comm 
 from emp e join dept d on e.deptno = d.deptno
 where e.job in(select e.job from emp e join dept d on e.deptno = d.deptno where d.loc = 'DALLAS')
       and e.mgr in(select e.mgr from emp e join dept d on e.deptno = d.deptno where d.loc = 'DALLAS');

--------------------------------------------------------------------------------