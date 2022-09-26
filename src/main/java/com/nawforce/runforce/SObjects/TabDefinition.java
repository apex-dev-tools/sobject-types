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

	public TabDefinition clone$() {throw new UnsupportedOperationException();}
	public TabDefinition clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public TabDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public TabDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public TabDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
