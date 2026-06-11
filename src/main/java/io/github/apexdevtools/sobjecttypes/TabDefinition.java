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
public class TabDefinition extends SObject {
	public static SObjectType$<TabDefinition> SObjectType;
	public static SObjectFields$<TabDefinition> Fields;

	public String DurableId;
	public Id Id;
	public Boolean IsAvailableInAloha;
	public Boolean IsAvailableInDesktop;
	public Boolean IsAvailableInLightning;
	public Boolean IsAvailableInMobile;
	public Boolean IsCustom;
	public String Label;
	public String MobileUrl;
	public String Name;
	public String SobjectName;
	public String Url;

	public AppTabMember[] AppTabs;
	public ColorDefinition[] Colors;
	public IconDefinition[] Icons;

	public TabDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public TabDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TabDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TabDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TabDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
