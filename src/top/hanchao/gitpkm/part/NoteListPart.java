package top.hanchao.gitpkm.part;

import javax.annotation.PostConstruct;

import org.eclipse.swt.widgets.Composite;

/**
 * 右侧某个笔记内容
 * 
 * @author hanchao
 *
 */
public class NoteListPart {

	public NoteListPart() {
		System.out.println(this);
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
	  System.out.println(this.getClass().getSimpleName()
	  + " @PostConstruct method called.");
	}
}
