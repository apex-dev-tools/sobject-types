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
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ApiEventStream extends SObject {
	public static SObjectType$<ApiEventStream> SObjectType;
	public static SObjectFields$<ApiEventStream> Fields;

	public String AdditionalInfo;
	public String ApiType;
	public Decimal ApiVersion;
	public String Application;
	public String Client;
	public String ConnectedAppId;
	public Datetime CreatedDate;
	public Integer ElapsedTime;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventUuid;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public String LoginKey;
	public String Operation;
	public String Platform;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public String QueriedEntities;
	public String Query;
	public String Records;
	public String RelatedEventIdentifier;
	public String ReplayId;
	public String RequestIdentifier;
	public Decimal RowsProcessed;
	public Decimal RowsReturned;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public String UserAgent;
	public Id UserId;
	public User User;
	public String Username;

	public ApiEventStream clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApiEventStream clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApiEventStream clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApiEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApiEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
