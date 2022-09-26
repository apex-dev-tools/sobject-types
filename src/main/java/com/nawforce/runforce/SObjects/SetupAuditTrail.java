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
public class SetupAuditTrail extends SObject {
	public static SObjectType$<SetupAuditTrail> SObjectType;
	public static SObjectFields$<SetupAuditTrail> Fields;

	public String Action;
	public String CreatedByContext;
	public Id CreatedById;
	public User CreatedBy;
	public String CreatedByIssuer;
	public Datetime CreatedDate;
	public String DelegateUser;
	public String Display;
	public Id Id;
	public String ResponsibleNamespacePrefix;
	public String Section;

	public SetupAuditTrail clone$() {throw new java.lang.UnsupportedOperationException();}
	public SetupAuditTrail clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SetupAuditTrail clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SetupAuditTrail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SetupAuditTrail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
