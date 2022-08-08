/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PromptVersion extends SObject {
	public static SObjectType$<PromptVersion> SObjectType;
	public static SObjectFields$<PromptVersion> Fields;

	public com.nawforce.runforce.System.String ActionButtonLabel;
	public com.nawforce.runforce.System.String ActionButtonLink;
	public com.nawforce.runforce.System.String Body;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.Integer DelayDays;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DismissButtonLabel;
	public com.nawforce.runforce.System.String DisplayPosition;
	public com.nawforce.runforce.System.String DisplayType;
	public com.nawforce.runforce.System.String ElementRelativePosition;
	public Date EndDate;
	public com.nawforce.runforce.System.String Header;
	public Id Id;
	public com.nawforce.runforce.System.String ImageAltText;
	public Id ImageId;
	public ContentAsset Image;
	public com.nawforce.runforce.System.String ImageLocation;
	public com.nawforce.runforce.System.String IndexWithIsPublished;
	public com.nawforce.runforce.System.String IndexWithoutIsPublished;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsPublished;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String MasterLabel;
	public Id ParentId;
	public Prompt Parent;
	public Id PublishedByUserId;
	public User PublishedByUser;
	public Date PublishedDate;
	public com.nawforce.runforce.System.String ReferenceElementContext;
	public com.nawforce.runforce.System.Boolean ShouldDisplayActionButton;
	public com.nawforce.runforce.System.Boolean ShouldIgnoreGlobalDelay;
	public Date StartDate;
	public com.nawforce.runforce.System.Integer StepNumber;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String TargetAppDeveloperName;
	public com.nawforce.runforce.System.String TargetAppNamespacePrefix;
	public com.nawforce.runforce.System.String TargetPageKey1;
	public com.nawforce.runforce.System.String TargetPageKey1Ref;
	public com.nawforce.runforce.System.String TargetPageKey2;
	public com.nawforce.runforce.System.String TargetPageKey3;
	public com.nawforce.runforce.System.String TargetPageType;
	public com.nawforce.runforce.System.String ThemeColor;
	public com.nawforce.runforce.System.String ThemeSaturation;
	public com.nawforce.runforce.System.Integer TimesToDisplay;
	public com.nawforce.runforce.System.String Title;
	public com.nawforce.runforce.System.String UserAccess;
	public com.nawforce.runforce.System.String UserProfileAccess;
	public com.nawforce.runforce.System.Integer VersionNumber;
	public com.nawforce.runforce.System.String VideoLink;

	public PromptVersionLocalization[] Localization;

	public PromptVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromptVersion clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromptVersion clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromptVersion clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromptVersion clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
