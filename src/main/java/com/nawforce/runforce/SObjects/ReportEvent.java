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
public class ReportEvent extends SObject {
	public static SObjectType$<ReportEvent> SObjectType;
	public static SObjectFields$<ReportEvent> Fields;

	public com.nawforce.runforce.System.String ColumnHeaders;
	public Datetime CreatedDate;
	public Id DashboardId;
	public Dashboard Dashboard;
	public com.nawforce.runforce.System.String DashboardName;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DisplayedFieldEntities;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public com.nawforce.runforce.System.String EventIdentifier;
	public com.nawforce.runforce.System.String EventSource;
	public com.nawforce.runforce.System.String ExecutionIdentifier;
	public com.nawforce.runforce.System.String ExportFileFormat;
	public com.nawforce.runforce.System.String Format;
	public com.nawforce.runforce.System.String GroupedColumnHeaders;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsScheduled;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public com.nawforce.runforce.System.String LoginKey;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer NumberOfColumns;
	public com.nawforce.runforce.System.String Operation;
	public Id OwnerId;
	public Name Owner;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public com.nawforce.runforce.System.String PolicyOutcome;
	public com.nawforce.runforce.System.String QueriedEntities;
	public com.nawforce.runforce.System.String Records;
	public com.nawforce.runforce.System.String RelatedEventIdentifier;
	public Id ReportId;
	public Report Report;
	public Decimal RowsProcessed;
	public com.nawforce.runforce.System.String Scope;
	public com.nawforce.runforce.System.Integer Sequence;
	public com.nawforce.runforce.System.String SessionKey;
	public com.nawforce.runforce.System.String SessionLevel;
	public com.nawforce.runforce.System.String SourceIp;
	public Id UserId;
	public User User;
	public com.nawforce.runforce.System.String Username;

	public ReportEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReportEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReportEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReportEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReportEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
