/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ReportEvent extends SObject {
	public static SObjectType$<ReportEvent> SObjectType;
	public static SObjectFields$<ReportEvent> Fields;

	public String ActionName;
	public String BotSessionIdentifier;
	public String ColumnHeaders;
	public Datetime CreatedDate;
	public Id DashboardId;
	public Dashboard Dashboard;
	public String DashboardName;
	public String Description;
	public String DisplayedFieldEntities;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventSource;
	public String ExecutionIdentifier;
	public String ExportFileFormat;
	public String Format;
	public String GroupedColumnHeaders;
	public Id Id;
	public Boolean IsScheduled;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public String LoginKey;
	public String Name;
	public Integer NumberOfColumns;
	public String Operation;
	public Id OwnerId;
	public Name Owner;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public String QueriedEntities;
	public String Records;
	public String RelatedEventIdentifier;
	public Id ReportId;
	public Report Report;
	public Decimal RowsProcessed;
	public String Scope;
	public Integer Sequence;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public Id UserId;
	public User User;
	public String Username;

	public ReportEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReportEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReportEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReportEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReportEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
