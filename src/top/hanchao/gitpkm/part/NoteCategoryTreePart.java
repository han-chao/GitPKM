package top.hanchao.gitpkm.part;

import javax.annotation.PostConstruct;

import org.eclipse.swt.widgets.Composite;

/**
 * 最左侧笔记分类树
 * 
 * @author hanchao
 *
 */
public class NoteCategoryTreePart {

	public NoteCategoryTreePart() {
		System.out.println(this);
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
	  System.out.println(this.getClass().getSimpleName()
	  + " @PostConstruct method called.");
	}
	
}
