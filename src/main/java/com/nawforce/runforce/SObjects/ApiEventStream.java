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
public class ApiEventStream extends SObject {
	public static SObjectType$<ApiEventStream> SObjectType;
	public static SObjectFields$<ApiEventStream> Fields;

	public com.nawforce.runforce.System.String AdditionalInfo;
	public com.nawforce.runforce.System.String ApiType;
	public Decimal ApiVersion;
	public com.nawforce.runforce.System.String Application;
	public com.nawforce.runforce.System.String Client;
	public com.nawforce.runforce.System.String ConnectedAppId;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.Integer ElapsedTime;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public com.nawforce.runforce.System.String EventIdentifier;
	public com.nawforce.runforce.System.String EventUuid;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public com.nawforce.runforce.System.String LoginKey;
	public com.nawforce.runforce.System.String Operation;
	public com.nawforce.runforce.System.String Platform;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public com.nawforce.runforce.System.String PolicyOutcome;
	public com.nawforce.runforce.System.String QueriedEntities;
	public com.nawforce.runforce.System.String Query;
	public com.nawforce.runforce.System.String Records;
	public com.nawforce.runforce.System.String RelatedEventIdentifier;
	public com.nawforce.runforce.System.String ReplayId;
	public Decimal RowsProcessed;
	public Decimal RowsReturned;
	public com.nawforce.runforce.System.String SessionKey;
	public com.nawforce.runforce.System.String SessionLevel;
	public com.nawforce.runforce.System.String SourceIp;
	public com.nawforce.runforce.System.String UserAgent;
	public Id UserId;
	public User User;
	public com.nawforce.runforce.System.String Username;

	public ApiEventStream clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApiEventStream clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApiEventStream clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApiEventStream clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApiEventStream clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
