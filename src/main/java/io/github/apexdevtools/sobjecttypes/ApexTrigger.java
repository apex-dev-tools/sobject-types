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
public class ApexTrigger extends SObject {
	public static SObjectType$<ApexTrigger> SObjectType;
	public static SObjectFields$<ApexTrigger> Fields;

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
	public String TableEnumOrId;
	public Boolean UsageAfterDelete;
	public Boolean UsageAfterInsert;
	public Boolean UsageAfterUndelete;
	public Boolean UsageAfterUpdate;
	public Boolean UsageBeforeDelete;
	public Boolean UsageBeforeInsert;
	public Boolean UsageBeforeUpdate;
	public Boolean UsageIsBulk;

	public ApexTrigger clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApexTrigger clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApexTrigger clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApexTrigger clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApexTrigger clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
