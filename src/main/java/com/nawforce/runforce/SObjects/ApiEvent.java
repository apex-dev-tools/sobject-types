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
public class ApiEvent extends SObject {
	public static SObjectType$<ApiEvent> SObjectType;
	public static SObjectFields$<ApiEvent> Fields;

	public String AdditionalInfo;
	public String ApiType;
	public Decimal ApiVersion;
	public String Application;
	public String Client;
	public Id ConnectedAppId;
	public ConnectedApplication ConnectedApp;
	public Datetime CreatedDate;
	public Integer ElapsedTime;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public Id Id;
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
	public Decimal RowsProcessed;
	public Decimal RowsReturned;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public String UserAgent;
	public Id UserId;
	public User User;
	public String Username;

	public ApiEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApiEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApiEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApiEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApiEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
