/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class AppDefinition extends SObject {
	public static SObjectType$<AppDefinition> SObjectType;
	public static SObjectFields$<AppDefinition> Fields;

	public String Description;
	public String DeveloperName;
	public String DurableId;
	public String HeaderColor;
	public Id Id;
	public Boolean IsLargeFormFactorSupported;
	public Boolean IsMediumFormFactorSupported;
	public Boolean IsNavAutoTempTabsDisabled;
	public Boolean IsNavPersonalizationDisabled;
	public Boolean IsNavTabPersistenceDisabled;
	public Boolean IsOmniPinnedViewEnabled;
	public Boolean IsOverrideOrgTheme;
	public Boolean IsSmallFormFactorSupported;
	public String Label;
	public String LogoUrl;
	public String MasterLabel;
	public String NamespacePrefix;
	public String NavType;
	public String UiType;
	public String UtilityBar;

	public AppTabMember[] AppTabs;

	public AppDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
