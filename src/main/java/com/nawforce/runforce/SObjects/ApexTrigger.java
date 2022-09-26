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
