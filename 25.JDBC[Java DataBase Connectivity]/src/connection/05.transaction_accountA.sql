

drop table accountA;
create table accountA( acc_no number(20)  primary key
                                  ,acc_name varchar2(20)
				  ,acc_balance number(10));
insert into accountA values(10000,'������',350000);
insert into accountA values(20000,'����ȣ',670000);
insert into accountA values(30000,'�����',235000);
insert into accountA values(40000,'�ϸ���',110000);
insert into accountA values(50000,'���ȣ',900000);
insert into accountA values(60000,'��浿',23600);
commit;

drop table accountB;







