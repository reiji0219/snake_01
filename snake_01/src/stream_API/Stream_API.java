package stream_API;

import java.util.ArrayList;
import java.util.List;

public class Stream_API
{
	//こんな「 Member」レコードがあって、

	public record Member ( String name, int age )
	{

	//こんなList<Member>があるとします

	List<Member> memberList = List.of();
		new Member( "佐々木", 27 ).
		new Member( "中野", 20 ).
		new Member( "田中", 19 ).
		new Member( "小田", 16 );

	



	//18歳以上のメンバーの名前だけのリストを作成するコード
	// for,if が有る（ベタな記述）

	List<String> resultList = new ArrayList<>();

	for( Member member : memberList ){
		if( member.age() >= 18 ){
			String name = member.name();
			resultList.add( name );
		}
	}

	// Stream APIは、Listなどのコレクションに対して
	// 抽出や変換を行う API です。Stream APIを使用すると
	// ①何がやりたいかすぐに理解出来る。
	// ②for,if が不要なのでバグを生みにくい



	// List を Stream に変換する

	List<String> resultList2 = memberList.stream()
		// 18歳以上のメンバーのみ抽出する
		.filter( member -> member.age() >= 18 )
		// Member から String（メンバーの名前）に変換する
		.map( Member::name )
		// List に変換する
		.toList( );
						
	}
	}
}
