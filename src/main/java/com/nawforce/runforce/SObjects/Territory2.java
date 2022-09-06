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
public class Territory2 extends SObject {
	public static SObjectType$<Territory2> SObjectType;
	public static SObjectFields$<Territory2> Fields;

	public String AccountAccessLevel;
	public String CaseAccessLevel;
	public String ContactAccessLevel;
	public String CurrencyIsoCode;
	public String Description;
	public String DeveloperName;
	public Id ForecastUserId;
	public User ForecastUser;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String OpportunityAccessLevel;
	public Id ParentTerritory2Id;
	public Territory2 ParentTerritory2;
	public Datetime SystemModstamp;
	public Id Territory2ModelId;
	public Territory2Model Territory2Model;
	public Id Territory2TypeId;
	public Territory2Type Territory2Type;

	public AccountUserTerritory2View[] AccountUserTerritory2Views;
	public Territory2ObjSharingConfig[] ObjectTerritory2Access;
	public ObjectTerritory2Association[] ObjectTerritory2Associations;
	public RuleTerritory2Association[] RuleTerritory2Associations;
	public Territory2ObjectExclusion[] Territory2ObjectExclusions;
	public UserTerritory2Association[] UserTerritory2Associations;

	public Territory2 clone$() {throw new java.lang.UnsupportedOperationException();}
	public Territory2 clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Territory2 clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Territory2 clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Territory2 clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
