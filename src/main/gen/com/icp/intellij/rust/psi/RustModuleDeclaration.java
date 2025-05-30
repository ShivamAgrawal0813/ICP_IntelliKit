// This is a generated file. Not intended for manual editing.
package com.icp.intellij.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustModuleDeclaration extends PsiElement {

  @Nullable
  RustFunctionDeclaration getFunctionDeclaration();

  @Nullable
  RustImplDeclaration getImplDeclaration();

  @Nullable
  RustModDeclaration getModDeclaration();

  @Nullable
  RustStructDeclaration getStructDeclaration();

  @Nullable
  RustUseDeclaration getUseDeclaration();

}
