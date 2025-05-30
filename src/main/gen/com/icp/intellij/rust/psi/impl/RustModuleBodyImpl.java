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

public class RustModuleBodyImpl extends ASTWrapperPsiElement implements RustModuleBody {

  public RustModuleBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RustVisitor visitor) {
    visitor.visitModuleBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) accept((RustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RustFunctionDeclaration> getFunctionDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustFunctionDeclaration.class);
  }

  @Override
  @NotNull
  public List<RustImplDeclaration> getImplDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustImplDeclaration.class);
  }

  @Override
  @NotNull
  public List<RustModDeclaration> getModDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustModDeclaration.class);
  }

  @Override
  @NotNull
  public List<RustStructDeclaration> getStructDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustStructDeclaration.class);
  }

  @Override
  @NotNull
  public List<RustUseDeclaration> getUseDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustUseDeclaration.class);
  }

}
