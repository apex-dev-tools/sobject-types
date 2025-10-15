/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LightningExperienceTheme extends SObject {
	public static SObjectType$<LightningExperienceTheme> SObjectType;
	public static SObjectFields$<LightningExperienceTheme> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DefaultBrandingSetId;
	public BrandingSet DefaultBrandingSet;
	public String Description;
	public String DesignSystemVersion;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDarkModeEnabled;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Boolean ShouldOverrideLoadingImage;
	public Datetime SystemModstamp;

	public LightningExperienceTheme clone$() {throw new java.lang.UnsupportedOperationException();}
	public LightningExperienceTheme clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LightningExperienceTheme clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LightningExperienceTheme clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LightningExperienceTheme clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
