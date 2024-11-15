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
public class EntitlementTemplate extends SObject {
	public static SObjectType$<EntitlementTemplate> SObjectType;
	public static SObjectFields$<EntitlementTemplate> Fields;

	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public Integer CasesPerEntitlement;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsPerIncident;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String NamespacePrefix;
	public Id SlaProcessId;
	public SlaProcess SlaProcess;
	public Datetime SystemModstamp;
	public Integer Term;
	public String Type;

	public EntitlementTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public EntitlementTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EntitlementTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EntitlementTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EntitlementTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
