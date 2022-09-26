/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PromptVersion extends SObject {
	public static SObjectType$<PromptVersion> SObjectType;
	public static SObjectFields$<PromptVersion> Fields;

	public String ActionButtonLabel;
	public String ActionButtonLink;
	public String Body;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer DelayDays;
	public String Description;
	public String DismissButtonLabel;
	public String DisplayPosition;
	public String DisplayType;
	public String ElementRelativePosition;
	public Date EndDate;
	public String Header;
	public Id Id;
	public String ImageAltText;
	public Id ImageId;
	public ContentAsset Image;
	public String ImageLink;
	public String ImageLocation;
	public String IndexWithIsPublished;
	public String IndexWithoutIsPublished;
	public Boolean IsDeleted;
	public Boolean IsPublished;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id ParentId;
	public Prompt Parent;
	public Id PublishedByUserId;
	public User PublishedByUser;
	public Date PublishedDate;
	public String ReferenceElementContext;
	public Boolean ShouldDisplayActionButton;
	public Boolean ShouldIgnoreGlobalDelay;
	public Date StartDate;
	public Integer StepNumber;
	public Datetime SystemModstamp;
	public String TargetAppDeveloperName;
	public String TargetAppNamespacePrefix;
	public String TargetPageKey1;
	public String TargetPageKey1Ref;
	public String TargetPageKey2;
	public String TargetPageKey3;
	public String TargetPageKey4;
	public String TargetPageType;
	public Id TargetRecordTypeId;
	public RecordType TargetRecordType;
	public String ThemeColor;
	public String ThemeSaturation;
	public Integer TimesToDisplay;
	public String Title;
	public String UserAccess;
	public String UserProfileAccess;
	public Integer VersionNumber;
	public String VideoLink;

	public PromptVersionLocalization[] Localization;

	public PromptVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromptVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromptVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromptVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromptVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
