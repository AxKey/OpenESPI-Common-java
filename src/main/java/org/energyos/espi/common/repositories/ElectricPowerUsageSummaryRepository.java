/*
 * Copyright 2013, 2014 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.energyos.espi.common.repositories;

import org.energyos.espi.common.domain.ElectricPowerUsageSummary;

import java.util.List;
import java.util.UUID;

public interface ElectricPowerUsageSummaryRepository {
    ElectricPowerUsageSummary findById(Long electricPowerUsageSummaryId);

    void persist(ElectricPowerUsageSummary electricPowerUsageSummary);

    ElectricPowerUsageSummary findByUUID(UUID uuid);

	List<Long> findAllIds();

	void deleteById(Long id);

    void createOrReplaceByUUID(ElectricPowerUsageSummary electricPowerUsageSummary);

}
