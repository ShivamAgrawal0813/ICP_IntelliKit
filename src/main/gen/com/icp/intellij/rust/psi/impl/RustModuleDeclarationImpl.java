// This is a generated file. Not intended for manual editing.
package com.icp.intellij.rust.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.icp.intellij.rust.psi.RustTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.icp.intellij.rust.psi.*;

public class RustModuleDeclarationImpl extends ASTWrapperPsiElement implements RustModuleDeclaration {

  public RustModuleDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RustVisitor visitor) {
    visitor.visitModuleDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) accept((RustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustFunctionDeclaration getFunctionDeclaration() {
    return findChildByClass(RustFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public RustImplDeclaration getImplDeclaration() {
    return findChildByClass(RustImplDeclaration.class);
  }

  @Override
  @Nullable
  public RustModDeclaration getModDeclaration() {
    return findChildByClass(RustModDeclaration.class);
  }

  @Override
  @Nullable
  public RustStructDeclaration getStructDeclaration() {
    return findChildByClass(RustStructDeclaration.class);
  }

  @Override
  @Nullable
  public RustUseDeclaration getUseDeclaration() {
    return findChildByClass(RustUseDeclaration.class);
  }

}
