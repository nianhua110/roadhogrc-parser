/*
 * Copyright (c) 2017, CipherGateway and/or its affiliates. All rights  reserved.
 *
 */

import com.intellij.json.JsonLanguage;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RoadhogrcLanguage extends LanguageFileType {
  public static final RoadhogrcLanguage INSTNACE = new RoadhogrcLanguage();

  public RoadhogrcLanguage() {
    super(JsonLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "roadhogrc";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "roadhogrc";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "roadhogrc";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return IconLoader.getIcon("roadhog.jpg");
  }
}
