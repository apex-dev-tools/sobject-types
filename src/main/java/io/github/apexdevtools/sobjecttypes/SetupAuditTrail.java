/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
