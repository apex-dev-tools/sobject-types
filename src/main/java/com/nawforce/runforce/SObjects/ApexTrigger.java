/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ApexTrigger extends SObject {
	public static SObjectType$<ApexTrigger> SObjectType;
	public static SObjectFields$<ApexTrigger> Fields;

	public Decimal ApiVersion;
	public com.nawforce.runforce.System.String Body;
	public Decimal BodyCrc;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsValid;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.Integer LengthWithoutComments;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String NamespacePrefix;
	public com.nawforce.runforce.System.String Status;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String TableEnumOrId;
	public com.nawforce.runforce.System.Boolean UsageAfterDelete;
	public com.nawforce.runforce.System.Boolean UsageAfterInsert;
	public com.nawforce.runforce.System.Boolean UsageAfterUndelete;
	public com.nawforce.runforce.System.Boolean UsageAfterUpdate;
	public com.nawforce.runforce.System.Boolean UsageBeforeDelete;
	public com.nawforce.runforce.System.Boolean UsageBeforeInsert;
	public com.nawforce.runforce.System.Boolean UsageBeforeUpdate;
	public com.nawforce.runforce.System.Boolean UsageIsBulk;

	public ApexTrigger clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApexTrigger clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApexTrigger clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApexTrigger clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApexTrigger clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
