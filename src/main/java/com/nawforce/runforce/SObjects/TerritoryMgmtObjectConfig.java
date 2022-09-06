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
public class TerritoryMgmtObjectConfig extends SObject {
	public static SObjectType$<TerritoryMgmtObjectConfig> SObjectType;
	public static SObjectFields$<TerritoryMgmtObjectConfig> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultAccessLevel;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String Object;
	public String State;
	public Datetime SystemModstamp;

	public TerritoryMgmtObjectConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public TerritoryMgmtObjectConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TerritoryMgmtObjectConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TerritoryMgmtObjectConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TerritoryMgmtObjectConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
