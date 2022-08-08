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
public class RecordActionHistory extends SObject {
	public static SObjectType$<RecordActionHistory> SObjectType;
	public static SObjectFields$<RecordActionHistory> Fields;

	public com.nawforce.runforce.System.String ActionDefinitionApiName;
	public com.nawforce.runforce.System.String ActionDefinitionLabel;
	public com.nawforce.runforce.System.String ActionType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsMandatory;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LoggedTime;
	public Id ParentRecordId;
	public SObject ParentRecord;
	public com.nawforce.runforce.System.String Pinned;
	public com.nawforce.runforce.System.String RecordActionId;
	public com.nawforce.runforce.System.String State;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public RecordActionHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecordActionHistory clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecordActionHistory clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecordActionHistory clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecordActionHistory clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
