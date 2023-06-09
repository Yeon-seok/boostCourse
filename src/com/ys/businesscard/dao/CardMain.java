package com.ys.businesscard.dao;

import java.util.Scanner;

import com.ys.businesscard.dto.CardDto;

public class CardMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CardDao dao = new CardDao();
		while(true) {
			System.out.print("메뉴를 입력하세요 : ");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				System.out.print("전화번호를 입력하세요 : ");
				String phone = sc.next();
				System.out.print("회사 이름을 입력하세요 : ");
				String company = sc.next();
				dao.addCard(name, phone, company);
			}
			else if(select == 2) {
				System.out.print("검색할 이름을 입력하세요(like 검색) : ");
				String name = sc.next();
				CardDto card = dao.searchCard(name);
				System.out.println(card);
			}
			else if(select == 3) {
				break;
			}
			else {
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
	}
}
