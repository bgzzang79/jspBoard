package student.service;

import java.util.List;
import java.util.Map;

import student.model.StudentVo;

public interface StudentServiceInf {
	/**
	* Method : selectAllStudent
	* 최초작성일 : 2018. 7. 9.
	* 작성자 : PC09
	* 변경이력 :
	* @return
	* Method 설명 : 전체 학생 정보를 조회
	*/
	List<StudentVo> selectAllStudent();
	
	/**
	* Method : getStudent
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC09
	* 변경이력 :
	* @param id
	* @return
	* Method 설명 : ID를 입력받아 해당 학생 조회
	*/
	List<StudentVo> getStudent(int id);
	
	/**
	 * Method : getStudent
	 * 최초작성일 : 2018. 7. 10.
	 * 작성자 : PC09
	 * 변경이력 :
	 * @param id
	 * @return
	 * Method 설명 : ID를 입력받아 해당 학생 조회
	 */
	StudentVo getStudent2(int id);
	/**
	* Method : getStudent
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC09
	* 변경이력 :
	* @param studentVo
	* @return
	* Method 설명 : 학생 정보 조회
	*/
	StudentVo getStudentVo(StudentVo studentVo);
	
	/**
	* Method : getStudentPageList
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC09
	* 변경이력 :
	* @param map
	* @return
	* Method 설명 : 학생 페이지 리스트 조회 
	*/
	List<StudentVo> getStudentPageList(Map<String, Integer> map);
	/**
	* Method : studentUpdate
	* 최초작성일 : 2018. 7. 17.
	* 작성자 : PC09
	* 변경이력 :
	* @param studentVo
	* @return
	* Method 설명 : 학생 정보 업데이트
	*/
	int studentUpdate(StudentVo studentVo);
	/**
	* Method : getStudent
	* 최초작성일 : 2018. 7. 18.
	* 작성자 : PC09
	* 변경이력 :
	* @param std_id
	* @return
	* Method 설명 : 사용자 정보 조회
	*/
	StudentVo getStudentId(String std_id);
//	/**
//	* Method : loginChk
//	* 최초작성일 : 2018. 7. 18.
//	* 작성자 : PC09
//	* 변경이력 :
//	* @param studentVo
//	* @return
//	* Method 설명 : 로그인 확인
//	*/
//	int loginChk(StudentVo studentVo);
}
