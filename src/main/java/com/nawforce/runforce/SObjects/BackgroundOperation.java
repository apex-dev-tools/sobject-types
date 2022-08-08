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
public class BackgroundOperation extends SObject {
	public static SObjectType$<BackgroundOperation> SObjectType;
	public static SObjectFields$<BackgroundOperation> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Error;
	public com.nawforce.runforce.System.String ExecutionGroup;
	public Datetime ExpiresAt;
	public Datetime FinishedAt;
	public Id GroupLeaderId;
	public BackgroundOperation GroupLeader;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer NumFollowers;
	public com.nawforce.runforce.System.String ParentKey;
	public Datetime ProcessAfter;
	public com.nawforce.runforce.System.Integer RetryBackoff;
	public com.nawforce.runforce.System.Integer RetryCount;
	public com.nawforce.runforce.System.Integer RetryLimit;
	public com.nawforce.runforce.System.String SequenceGroup;
	public com.nawforce.runforce.System.Integer SequenceNumber;
	public Datetime StartedAt;
	public com.nawforce.runforce.System.String Status;
	public Datetime SubmittedAt;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.Integer Timeout;
	public com.nawforce.runforce.System.String Type;
	public com.nawforce.runforce.System.String WorkerUri;

	public BackgroundOperation[] MergedOperations;

	public BackgroundOperation clone$() {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperation clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperation clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperation clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperation clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
