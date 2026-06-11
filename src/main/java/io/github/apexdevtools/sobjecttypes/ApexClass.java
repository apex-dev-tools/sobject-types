/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ApexClass extends SObject {
	public static SObjectType$<ApexClass> SObjectType;
	public static SObjectFields$<ApexClass> Fields;

	public Decimal ApiVersion;
	public String Body;
	public Decimal BodyCrc;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsValid;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer LengthWithoutComments;
	public String Name;
	public String NamespacePrefix;
	public String Status;
	public Datetime SystemModstamp;

	public SetupEntityAccess[] SetupEntityAccessItems;

	public ApexClass clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApexClass clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApexClass clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApexClass clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApexClass clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
