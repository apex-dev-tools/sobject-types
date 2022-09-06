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
public class ListViewEvent extends SObject {
	public static SObjectType$<ListViewEvent> SObjectType;
	public static SObjectFields$<ListViewEvent> Fields;

	public String AppName;
	public String ColumnHeaders;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventSource;
	public String ExecutionIdentifier;
	public String FilterCriteria;
	public Id Id;
	public Id ListViewId;
	public ListView ListView;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public String LoginKey;
	public String Name;
	public Integer NumberOfColumns;
	public String OrderBy;
	public Id OwnerId;
	public Name Owner;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public String QueriedEntities;
	public String Records;
	public String RelatedEventIdentifier;
	public Decimal RowsProcessed;
	public String Scope;
	public Integer Sequence;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public Id UserId;
	public User User;
	public String Username;

	public ListViewEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ListViewEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ListViewEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ListViewEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ListViewEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
