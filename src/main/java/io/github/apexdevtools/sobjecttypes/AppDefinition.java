/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

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
