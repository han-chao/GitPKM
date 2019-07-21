package top.hanchao.gitpkm.part;

import javax.annotation.PostConstruct;

import org.eclipse.swt.widgets.Composite;

/**
 * 中间笔记列表，某个分类下的笔记
 * 
 * @author hanchao
 *
 */
public class NoteDetailPart {

	public NoteDetailPart() {
		System.out.println(this);
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
	  System.out.println(this.getClass().getSimpleName()
	  + " @PostConstruct method called.");
	}
}
