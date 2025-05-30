// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class FunctionDeclarationImpl extends ASTWrapperPsiElement implements FunctionDeclaration {

  public FunctionDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitFunctionDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FunctionBody getFunctionBody() {
    return findNotNullChildByClass(FunctionBody.class);
  }

  @Override
  @Nullable
  public ParameterList getParameterList() {
    return findChildByClass(ParameterList.class);
  }

  @Override
  @Nullable
  public TypeExpression getTypeExpression() {
    return findChildByClass(TypeExpression.class);
  }

  @Override
  @Nullable
  public Visibility getVisibility() {
    return findChildByClass(Visibility.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

}
