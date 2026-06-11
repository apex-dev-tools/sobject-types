/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AbnExperiment extends SObject {
	public static SObjectType$<AbnExperiment> SObjectType;
	public static SObjectFields$<AbnExperiment> Fields;

	public Decimal ChanceToWinThreshold;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime LastAnalyzed;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer MaximumDurationInMinutes;
	public Integer MinimumDurationInMinutes;
	public Integer MinimumRequiredParticipants;
	public String Name;
	public String PersonalizationSchemaEnum;
	public Id PersonalizationSchemaId;
	public PersonalizationSchema PersonalizationSchema;
	public Id PrimaryMetricId;
	public Name PrimaryMetric;
	public Id ProfileDataGraphId;
	public DataGraph ProfileDataGraph;
	public Integer ScheduleFrequencyInMinutes;
	public String Source;
	public Id SourceRecordId;
	public Name SourceRecord;
	public Datetime StartedDate;
	public String State;
	public String Status;
	public Datetime StoppedDate;
	public Datetime SystemModstamp;
	public String WinnerSelectionMode;

	public AbnExperimentCohort[] AbnExperimentCohorts;
	public PersonalizationPoint[] PersonalizationPoints;

	public AbnExperiment clone$() {throw new java.lang.UnsupportedOperationException();}
	public AbnExperiment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AbnExperiment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AbnExperiment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AbnExperiment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
