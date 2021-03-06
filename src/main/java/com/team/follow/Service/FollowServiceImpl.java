package com.team.follow.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.follow.DAO.FollowDAO;
import com.team.follow.VO.FollowVO;

@Service("FollowService")
public class FollowServiceImpl implements FollowService {

	@Autowired
	private FollowDAO followDAO;
	
	@Override
	public List<FollowVO> GetAllFollower(String id) {
		// 해당 아이디의 모든 팔로워 목록 리턴(follower_id, follow_date)
		return followDAO.GetAllFollower(id);
	}

	@Override
	public List<FollowVO> GetAllFollowing(String id) {
		// 해당 아이디의 모든 팔로잉 목록 리턴(following_id, follow_date)
		return followDAO.GetAllFollowing(id);
	}

	@Override
	public void DeleteFollowing(FollowVO vo) {
		followDAO.DeleteFollowing(vo);
	}

	@Override
	public void InsertFollowing(FollowVO vo) {		
		followDAO.InsertFollowing(vo);		
	}

	@Override
	public boolean IsFollowing(FollowVO vo) {
		return followDAO.IsFollowing(vo);
	}
	
}
