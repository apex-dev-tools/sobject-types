/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class IntegrationProviderExecutionChangeEvent extends SObject {
	public static SObjectType$<IntegrationProviderExecutionChangeEvent> SObjectType;
	public static SObjectFields$<IntegrationProviderExecutionChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ErrorCode;
	public Datetime ExecutionDateTime;
	public Id Id;
	public Id IntegrationProviderDefId;
	public IntegrationProviderDef IntegrationProviderDef;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReferenceObjectIdentifier;
	public String ReplayId;
	public Id RequestPayloadId;
	public ContentDocument RequestPayload;
	public Id ResponsePayloadId;
	public ContentDocument ResponsePayload;
	public String Status;

	public IntegrationProviderExecutionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderExecutionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderExecutionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderExecutionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderExecutionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
