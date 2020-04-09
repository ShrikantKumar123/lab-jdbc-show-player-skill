package controller;

import java.util.ArrayList;

import dao.SkillDAO;
import model.Skill;

public class Main {

	public static void main(String[] args) throws Exception 
	{

		SkillDAO skilldao=new SkillDAO();

		ArrayList<Skill>  list= (ArrayList<Skill>) skilldao.listAllSkills();


		System.out.println("Id"+"\t"+"name");

		for(Skill s: list)
		{
			System.out.println(s.getSkilld()+"\t"+s.getSkillName());

		}
	}

}

