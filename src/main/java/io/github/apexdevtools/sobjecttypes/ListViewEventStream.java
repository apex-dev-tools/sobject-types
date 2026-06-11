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

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ListViewEventStream extends SObject {
	public static SObjectType$<ListViewEventStream> SObjectType;
	public static SObjectFields$<ListViewEventStream> Fields;

	public String AppName;
	public String ColumnHeaders;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventSource;
	public String EventUuid;
	public String ExecutionIdentifier;
	public String FilterCriteria;
	public String ListViewId;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public String LoginKey;
	public String Name;
	public Integer NumberOfColumns;
	public String OrderBy;
	public String OwnerId;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public Id ProfileId;
	public Profile Profile;
	public String QueriedEntities;
	public String Records;
	public String RelatedEventIdentifier;
	public String ReplayId;
	public Id RoleId;
	public UserRole Role;
	public Decimal RowsProcessed;
	public String Scope;
	public Integer Sequence;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public Id UserId;
	public User User;
	public String Username;

	public ListViewEventStream clone$() {throw new java.lang.UnsupportedOperationException();}
	public ListViewEventStream clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ListViewEventStream clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ListViewEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ListViewEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
